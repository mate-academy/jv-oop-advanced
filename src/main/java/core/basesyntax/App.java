package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.utils.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    private static final int SIZE_ARRAY = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < SIZE_ARRAY; i++) {
            if (i <= (SIZE_ARRAY / 2)) {
                figureSupplier.getRandomFigure().draw();
            } else {
                figureSupplier.getDefaultFigure().draw();
            }
        }
    }
}
