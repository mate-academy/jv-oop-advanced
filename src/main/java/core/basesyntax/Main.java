package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int NUM_CONSTANT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUM_CONSTANT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < NUM_CONSTANT; i++) {
            if (i > 2) {
                figures[i] = figureSupplier.getDefaultFigure();

            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }
        for (Figure figure : figures) {
            figure.displayProperty();
        }
    }
}
