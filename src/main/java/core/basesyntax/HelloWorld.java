package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure [] figureArray = new Figure[5];
        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure:figureArray) {
            figure.draw();
        }
    }
}
