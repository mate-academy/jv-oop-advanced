package core.basesyntax;

public class Main {
    public static final int FIGURE_ARRAY_SIZE = 6;
    public static final int RANDOM_FIGURE_COUNT = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];

        for (int i = 0; i < RANDOM_FIGURE_COUNT; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = RANDOM_FIGURE_COUNT; i < FIGURE_ARRAY_SIZE; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
