package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {

    public static final int FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_COUNT];

        for (int i = 0; i != FIGURES_COUNT >> 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = FIGURES_COUNT >> 1; i != FIGURES_COUNT; i++) {
            figures[i] = FigureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
