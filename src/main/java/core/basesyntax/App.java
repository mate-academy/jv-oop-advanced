package core.basesyntax;

import core.basesyntax.figures.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class App {

    public static void main(String[] args) {
        Figure[] figures = new Figure[8];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < 8; i++) {
            if (i < 4) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.about();
        }
    }
}
