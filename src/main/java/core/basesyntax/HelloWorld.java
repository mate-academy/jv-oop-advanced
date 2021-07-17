package core.basesyntax;

import core.basesyntax.util.Figure;
import core.basesyntax.util.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = figureSupplier.getRandomFigures(100);

        // draw all figures
        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
