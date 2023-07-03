package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final Figure[] figures = new Figure[NUMBER_OF_FIGURES];

    public static void main(String[] args) {
        for (int i = 0; i <= NUMBER_OF_FIGURES; i++) {
            if (i <= NUMBER_OF_FIGURES / 2) {
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
