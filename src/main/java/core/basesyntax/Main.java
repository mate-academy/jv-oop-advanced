package core.basesyntax;

public class Main {
    private static final int FIGURE_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_SIZE];

        for (int i = 0; i < FIGURE_ARRAY_SIZE / 2; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = FIGURE_ARRAY_SIZE / 2; i < FIGURE_ARRAY_SIZE; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
