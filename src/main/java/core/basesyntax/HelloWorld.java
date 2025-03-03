package core.basesyntax;

import core.basesyntax.supliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        figureSupplier.getRandomFigure().draw();
        figureSupplier.getDefaultFigure().draw();
    }

}
