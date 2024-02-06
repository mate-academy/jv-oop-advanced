package core.basesyntax;

public class Main {
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < SIZE_OF_ARRAY; i++) {
            if (i < SIZE_OF_ARRAY / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.drawFigure();
        }
    }
}
