package core.basesyntax;

import core.basesyntax.supplier.FigureSupplier;

public class Main {
    private static final int FIGURES_NUMBER = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_NUMBER];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < FIGURES_NUMBER; i++) {
            if (i < FIGURES_NUMBER / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
