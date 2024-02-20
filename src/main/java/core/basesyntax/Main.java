package core.basesyntax;

import core.basesyntax.figures.Figure;

public class Main {
    private static final int MAX_FIGURES = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_FIGURES];
        for (int i = 0; i < MAX_FIGURES; i++) {
            if (i < MAX_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
