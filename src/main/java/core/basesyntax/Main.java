package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.randomizer.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int LENGTH_OF_ARRAY = 6;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[LENGTH_OF_ARRAY];

        for (int i = 0; i < LENGTH_OF_ARRAY / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }

        for (int i = LENGTH_OF_ARRAY / 2; i < LENGTH_OF_ARRAY; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
