package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Application {
    private static final int FIGURES_AMOUNT = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURES_AMOUNT];
        for (int i = 0; i < FIGURES_AMOUNT; i++) {
            figures[i] = i < FIGURES_AMOUNT
                    / 2 ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
