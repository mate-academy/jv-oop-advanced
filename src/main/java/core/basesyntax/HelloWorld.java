package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int FIGURE_COUNT = 6;
    private static final double HALF = 0.5;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];

        int halfCount = (int) (FIGURE_COUNT * HALF);
        for (int i = 0; i < halfCount; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (int i = halfCount; i < FIGURE_COUNT; i++) {
            figures[i] = supplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
