package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_COUNT];

        for (int i = 0; i < FIGURE_COUNT; i++) {
            if (i < FIGURE_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
            System.out.println();
        }
    }
}
