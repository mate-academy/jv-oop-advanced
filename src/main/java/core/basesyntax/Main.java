package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int MAX_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[MAX_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < MAX_FIGURES; i++) {
            figures[i] = i < MAX_FIGURES / 2
                   ? figureSupplier.getRandomFigure()
                   : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
