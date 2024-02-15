package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int SIZE_OF_FIGURES_ARRAY = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_FIGURES_ARRAY];

        for (int i = 0; i < SIZE_OF_FIGURES_ARRAY; i++) {
            if (i < (SIZE_OF_FIGURES_ARRAY / 2)) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
