package core.basesyntax.main;

import core.basesyntax.base.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int figureCount = 6;
        Figure[] figures = new Figure[figureCount];
        for (int i = 0; i < figureCount - 1; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
        }

        figures[figures.length - 1] = FigureSupplier.getDefaultFigure();

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
