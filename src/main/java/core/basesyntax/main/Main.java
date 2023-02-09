package core.basesyntax.main;

import core.basesyntax.base.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final FigureSupplier figureSupplier = new FigureSupplier();
        final int figureCount = 6;
        final int halfSize = 3;
        Figure[] figures = new Figure[figureCount];

        for (int i = 0; i < halfSize; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = halfSize; i < figureCount; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
