package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final int FIGURE_COUNT = 6;

    public static void main(String[] args) {
        Figure[] figure = new Figure[FIGURE_COUNT];
        for (int i = 0; i < figure.length / 2; i++) {
            figure[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figure.length / 2; i < figure.length; i++) {
            figure[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figures : figure) {
            figures.draw();
        }
    }
}
