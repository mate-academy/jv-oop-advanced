package core.basesyntax;

import core.basesyntax.models.Figure;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static final int ARRAY_SIZE = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i <= ARRAY_SIZE / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
