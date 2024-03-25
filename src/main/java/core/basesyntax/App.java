package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.utils.ColorSupplier;
import core.basesyntax.utils.FigureSupplier;

/**
 * Feel free to remove this class and create your own.
 */
public class App {
    private static final int SIZE_ARRAY = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();

        Figure[] figures = new Figure[SIZE_ARRAY];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure(colorSupplier);
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
