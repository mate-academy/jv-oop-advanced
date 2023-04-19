package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;
    private static final int ARRAY_HALF = 6 / 2;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < ARRAY_HALF; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = ARRAY_HALF; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
