package core.basesyntax.main;

import core.basesyntax.figures.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int FIGURE_NUMBERS = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_NUMBERS];

        for (int i = 0; i < FIGURE_NUMBERS; i++) {
            if (i < FIGURE_NUMBERS / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
