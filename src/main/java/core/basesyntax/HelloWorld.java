package core.basesyntax;

import core.basesyntax.supplier.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static int FIGURE_AMOUNT = 6;
    private static int halfOfArray = (FIGURE_AMOUNT + FIGURE_AMOUNT % 2) / 2;
    private static FigureSupplier figure = new FigureSupplier();
    private static Figure[] arrayOfFigures = new Figure[FIGURE_AMOUNT];

    public static void main(String[] args) {
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < halfOfArray) {
                arrayOfFigures[i] = figure.getRandomFigure();
                arrayOfFigures[i].draw();
            } else {
                arrayOfFigures[i] = figure.getDefaultFigure();
                arrayOfFigures[i].draw();
            }
        }
    }
}
