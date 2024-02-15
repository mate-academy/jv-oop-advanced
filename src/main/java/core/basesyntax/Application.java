package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Application {
    private static final int FIGURES_COUNT = 10;

    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i < FIGURES_COUNT; i++) {
            if (i < FIGURES_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
