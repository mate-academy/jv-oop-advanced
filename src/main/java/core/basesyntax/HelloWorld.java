package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int NUMBER_OF_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURE];
        for (int i = 0; i < NUMBER_OF_FIGURE; i++) {
            if (i <= (NUMBER_OF_FIGURE / 2) - 1) {
                figures[i] = new FigureSupplier().getRandomFigure();
            } else {
                figures[i] = new FigureSupplier().getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
            System.out.println();
        }
    }
}
