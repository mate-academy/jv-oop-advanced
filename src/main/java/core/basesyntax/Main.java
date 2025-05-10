package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int FIGURES_AMOUNT = 6;
    private static Figure[] figures = new Figure[FIGURES_AMOUNT];
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
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
