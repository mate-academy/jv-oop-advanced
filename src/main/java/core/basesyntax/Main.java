package core.basesyntax;

import core.basesyntax.supplier.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int ITERATIONS = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ITERATIONS];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure fig: figures) {
            fig.draw();
        }
    }
}
