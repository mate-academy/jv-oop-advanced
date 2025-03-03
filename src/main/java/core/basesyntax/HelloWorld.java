package core.basesyntax;

import core.basesyntax.supliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[10];
        for (int i = 0; i < figureArray.length / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 5; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }
        for (final Figure figure : figureArray) {
            System.out.println(figure);
        }
    }
}
