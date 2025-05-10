package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int FIGURE_AMOUNT = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURE_AMOUNT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURE_AMOUNT; i++) {
            figures[i] = i < 3 ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
