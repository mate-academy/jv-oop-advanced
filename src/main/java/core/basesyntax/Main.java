package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.figurehandlers.FigureSupplier;

public class Main {

    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }

}
