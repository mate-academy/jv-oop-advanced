package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;

public class Main {
    private static final int NUMBER_OF_FIGURES = 10;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < figures.length; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                figures[i] = FIGURE_SUPPLIER.getRandomFigure();
            } else {
                figures[i] = FIGURE_SUPPLIER.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
