package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.service.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Application {

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[6];

        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = figureSupplier.getRandomFigure();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : array) {
            figure.draw();
        }
    }
}
