package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static final int AMOUNT_TO_DRAW = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[AMOUNT_TO_DRAW];

        for (int i = 0; i != AMOUNT_TO_DRAW >> 1; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        for (int i = AMOUNT_TO_DRAW >> 1; i != AMOUNT_TO_DRAW; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
