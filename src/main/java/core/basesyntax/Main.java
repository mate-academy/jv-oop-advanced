package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int MAX_FIGURES_COUNT = 6;

    public static void main(String[] args) {
        FigureSupplier randFigure = new FigureSupplier();
        Figure[] figures = new Figure[MAX_FIGURES_COUNT];
        for (int i = 0; i < figures.length; i++) {
            if (i <= 2) {
                figures[i] = randFigure.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = randFigure.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
