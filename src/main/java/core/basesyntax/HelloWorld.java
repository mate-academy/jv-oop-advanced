package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int NUM_FIGURES = 4;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUM_FIGURES];
        int length = figures.length;
        int half = length / 2;
        for (int i = 0; i < length; i++) {
            if (i < half) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }

    }

}
