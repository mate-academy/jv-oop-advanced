package core.basesyntax;

public class Application {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];

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
