package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.service.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int AMOUNT_FIGURES = 6;
        final int HALF_FIGURES_COUNT = 3;

        Figure[] figures = new Figure[AMOUNT_FIGURES];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < HALF_FIGURES_COUNT; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = 3; i < AMOUNT_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
