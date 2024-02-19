package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class HelloWorld {
    private static int FIGURE_AMOUNT = 7;
    private static FigureSupplier figure = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] arrayOfFigures = new Figure[FIGURE_AMOUNT];
        for (int i = 0; i < arrayOfFigures.length; i++) {
            if (i < (FIGURE_AMOUNT / 2)) {
                arrayOfFigures[i] = figure.getRandomFigure();
            } else {
                arrayOfFigures[i] = figure.getDefaultFigure();
            }
            arrayOfFigures[i].draw();
        }
    }
}
