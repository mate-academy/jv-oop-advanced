package core.basesyntax;

import core.basesyntax.model.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_AMOUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i < FIGURES_AMOUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();

        }
    }
}
