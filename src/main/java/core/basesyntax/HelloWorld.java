package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrayWithFigures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < arrayWithFigures.length; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                arrayWithFigures[i] = figureSupplier.getRandomFigure();
            } else {
                arrayWithFigures[i] = figureSupplier.getDefaultFigure();
            }
            arrayWithFigures[i].draw();
        }
    }
}
