package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.figures.suppliers.FigureSupplier;

public class Main {
    public static final int COUNT_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figures = new Figure[COUNT_FIGURES];

        for (int i = 0; i < figures.length; i++) {
            if (i < COUNT_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }

            figures[i].draw();
        }
    }
}
