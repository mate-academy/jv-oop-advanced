package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.FigureSupplier;

public class Main {
    private static final int ARR_LENGTH = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARR_LENGTH];

        for (int i = 0; i < ARR_LENGTH; i++) {
            if (i < ARR_LENGTH / 2) {
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
