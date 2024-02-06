package core.basesyntax.main;

import core.basesyntax.figures.Figure;

public class Main {
    private static final int FIGURES_NUMBERS = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_NUMBERS];
        for (int i = 0; i < FIGURES_NUMBERS; i++) {
            if (i < FIGURES_NUMBERS / 2) {
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
