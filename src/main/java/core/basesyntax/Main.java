package core.basesyntax;

import core.basesyntax.supplier.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        int halfIndex = figures.length / 2;
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i < halfIndex) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
