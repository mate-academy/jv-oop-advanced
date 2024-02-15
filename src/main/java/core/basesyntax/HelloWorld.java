package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int SIZE_OF_FIGURES_ARRAY = 6;
    private static final int FIRST_PART_OF_ARRAY = 3;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_FIGURES_ARRAY];

        for (int i = 0; i < FIRST_PART_OF_ARRAY; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = FIRST_PART_OF_ARRAY; i < SIZE_OF_FIGURES_ARRAY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
