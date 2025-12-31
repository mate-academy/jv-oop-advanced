package core.basesyntax;

import core.basesyntax.model.Figure;
import core.basesyntax.model.FigureSupplier;

public class Main {

    public static void main(String[] args) {
        final int max = 6;

        Figure[] figures = new Figure[max];

        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < max / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (int i = max / 2; i < max; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
