package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        final int BOUND = 5;
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[BOUND];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
