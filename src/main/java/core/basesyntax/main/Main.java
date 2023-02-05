package core.basesyntax.main;

import core.basesyntax.base.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        final int figureCount = 6;
        Figure[] figures = new Figure[figureCount];

        for (int i = 0; i < figureCount - 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        figures[figures.length - 1] = figureSupplier.getDefaultFigure();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
