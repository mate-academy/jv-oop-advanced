package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static final int FIGURES_AMOUNT = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < FIGURES_AMOUNT; i++) {
            figureSupplier.getRandomFigure().draw();
            System.out.println();
        }
    }
}
