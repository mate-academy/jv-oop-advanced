package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupply = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            figures[i] = figureSupply.getRandomFigure();
            if (i >= ARRAY_LENGTH / 2) {
                figures[i] = figureSupply.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
