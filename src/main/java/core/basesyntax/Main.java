package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.randomizer.FigureSupplier;

public class Main {
    private static final int ARRAY_LENGTH = 6;

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_LENGTH];

        for (int i = 0; i < ARRAY_LENGTH / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        for (int i = ARRAY_LENGTH / 2; i < ARRAY_LENGTH; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
