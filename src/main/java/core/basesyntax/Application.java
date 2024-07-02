package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.util.FigureSupplier;

public class Application {
    private static final int QUANTITY_FIGURES = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[QUANTITY_FIGURES];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
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
