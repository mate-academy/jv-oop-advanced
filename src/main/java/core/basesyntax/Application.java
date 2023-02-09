package core.basesyntax;

import core.basesyntax.entity.Figure;
import core.basesyntax.service.FigureSupplier;

public class Application {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.printInfo();
        }
    }
}
