package core.basesyntax;

public class Main {
    private static final int ROOF_SIZE_OF_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        final Figure[] figures = new Figure[6];
        for (int i = 0; i < ROOF_SIZE_OF_ARRAY; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.drawInfo();
        }
    }
}
