package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.supplier.ColorSupplier;
import core.basesyntax.supplier.FigureSupplier;

public class Main {
    private static final int MAX_ARRAY_LENGTH = 6;
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier(new ColorSupplier());
        Figure[] figures = new Figure[MAX_ARRAY_LENGTH];
        for (int i = 0; i < figures.length; i++) {
            if (i % 2 == 0) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}

