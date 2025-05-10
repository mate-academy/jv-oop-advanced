package core.basesyntax.main;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Application {
    private static final int ARRAY_LENGTH = 7;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i < ARRAY_LENGTH / 2) {
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
