package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int NUMBER_FIGURE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] arrFigure = new Figure[NUMBER_FIGURE];
        for (int i = 0; i < arrFigure.length; i++) {
            if (i < arrFigure.length / 2) {
                arrFigure[i] = figureSupplier.getRandomFigure();
            } else {
                arrFigure[i] = figureSupplier.getDefaultFigure();
            }
            arrFigure[i].drawFigure();
        }
    }
}
