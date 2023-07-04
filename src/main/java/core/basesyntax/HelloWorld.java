package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int NUMBER_OF_RANDOM_FIGURES = 3;
    private static final int NUMBER_OF_ARRAY_ITEMS = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_ARRAY_ITEMS];
        for (int i = 0; i < NUMBER_OF_RANDOM_FIGURES; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = NUMBER_OF_RANDOM_FIGURES; i < NUMBER_OF_ARRAY_ITEMS; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
