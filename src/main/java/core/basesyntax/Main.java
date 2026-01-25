package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int RANDOM_FIGURES_QTY = 5;
    private static final int TOTAL_FIGURES_QTY = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[TOTAL_FIGURES_QTY];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length;i++) {
            if (i < RANDOM_FIGURES_QTY) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
