package core.basesyntax;

import core.basesyntax.model.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();

        }
    }
}
