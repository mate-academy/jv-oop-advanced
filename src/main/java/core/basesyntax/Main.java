package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_COUNT];
        FigureSupplier supplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = supplier.getRandomFigure();
            } else {
                figures[i] = supplier.getDefaultFigure();
            }
        }
        for (Figure f : figures) {
            f.draw();
        }
    }
}
