package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

class Main {
    private static final int FIGURES_AMOUNT = 6;
    private static final FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] params) {
        Figure[] figures = new Figure[FIGURES_AMOUNT];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < FIGURES_AMOUNT / 2
                    ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
