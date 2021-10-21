package core.basesyntax;

import core.basesyntax.figures.Figure;

public class App {
    private static final int FIGURES_LENGTH = 8;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_LENGTH; i++) {
            if (i < FIGURES_LENGTH / 2) {
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
