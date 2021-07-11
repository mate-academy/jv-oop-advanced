package core.basesyntax;

import core.basesyntax.util.Figure;
import core.basesyntax.util.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figure[] figures = FigureSupplier.getRandomFigures(100);
        FigureSupplier.drawFigures(figures);
    }
}
