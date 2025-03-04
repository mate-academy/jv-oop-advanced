package core.basesyntax;

import core.basesyntax.supliers.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figureArray = new Figure[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE / 2; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
        }
        for (int i = ARRAY_SIZE / 2; i < ARRAY_SIZE; i++) {
            figureArray[i] = figureSupplier.getDefaultFigure();
        }
        for (final Figure figure : figureArray) {
            System.out.println(figure);
        }
    }
}
