package core.basesyntax;

import core.basesyntax.model.Figure;

public class Main {
    private static final int FIGURES_COUNT = 4;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];
        for (int i = 0; i < FIGURES_COUNT; i++) {
            if (i < FIGURES_COUNT / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
