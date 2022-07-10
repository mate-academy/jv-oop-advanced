package core.basesyntax;

public class Main {
    private static final int CAPACITY_OF_ARRAY = 6;

    public static void main(String[] args) {
        FigureBase[] figures = new FigureBase[CAPACITY_OF_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < CAPACITY_OF_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (FigureBase figure : figures) {
            figure.draw();
        }
    }
}
