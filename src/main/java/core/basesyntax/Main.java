package core.basesyntax;

import static core.basesyntax.FigureConstants.FIGURES_COUNT;
import static core.basesyntax.FigureConstants.HALF;

/**
 * Feel free to remove this class and create your own.
 */

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();

        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i < HALF; i++) {
            figures[i] = supplier.getRandomFigure();
        }
        for (int i = 0; i < FIGURES_COUNT; i++) {
            figures[i] = supplier.getDefaultFigure();
        }
        for (Figure f : figures) {
            f.draw();
        }
    }

}
