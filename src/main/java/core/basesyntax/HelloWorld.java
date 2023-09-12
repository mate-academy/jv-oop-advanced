package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure [] figures = new Figure[4];
        int middle = figures.length / 2;
        for (int i = 0; i < 4;i++) {
            if (i < middle) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
