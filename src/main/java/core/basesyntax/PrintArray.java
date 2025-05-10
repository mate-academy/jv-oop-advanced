package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.supplier.ColorSupplier;

public class PrintArray {
    private static final ColorSupplier.FigureSupplier figureSupplier
            = new ColorSupplier.FigureSupplier();
    private static final int NUMBERS_OF_FIGURE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBERS_OF_FIGURE];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigureAndColor();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
