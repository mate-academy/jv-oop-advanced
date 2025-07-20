package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureSupplier;

public class FiguresApp {
    private static FigureSupplier figureSupplier = new FigureSupplier();

    private static final int ARRAY_SIZE = 6;
    private static final int DEFAULT_FIGURES_SIZE = 3;

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < DEFAULT_FIGURES_SIZE) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
