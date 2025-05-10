package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Main {
    private static final int NUMBER_OF_FIGURES = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
