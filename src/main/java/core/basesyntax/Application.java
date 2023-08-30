package core.basesyntax;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.random.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {
    private static final int DEFAULT_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[DEFAULT_FIGURE];

        for (int i = 0; i < figures.length; i++) {
            if (i <= 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            }
        }
    }

}
