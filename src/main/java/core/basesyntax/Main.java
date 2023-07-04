package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.support.FigureSupplier;

public class Main {
    public static final int FIGURES_SIZE = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_SIZE];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_SIZE; i++) {
            if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            figures[i].draw();
        }
    }
}
