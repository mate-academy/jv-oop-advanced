package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Application {
    private static final int SIZE_OF_ARRAY = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[SIZE_OF_ARRAY];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            if (i < SIZE_OF_ARRAY / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].calculateArea();
            figures[i].draw();
        }

    }
}
