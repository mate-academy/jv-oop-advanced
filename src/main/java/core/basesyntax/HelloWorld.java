package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.figurehandlers.FigureSupplier;
/**
 * Feel free to remove this class and create your own.
 */

public class HelloWorld {

    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static int ARRAY_LENGTH = 6;

    public static void main(String[] args) {

        Figure[] figures = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }

}
