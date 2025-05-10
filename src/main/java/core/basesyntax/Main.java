package core.basesyntax;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = ARRAY_SIZE / 2; i < ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
