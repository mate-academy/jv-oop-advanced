package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int FIGURES_LENGTH = 3;

    public static void main(String[] args) {
        Figure[] arrayFigure = new Figure[FIGURES_LENGTH * 2];
        for (int i = 0; i < FIGURES_LENGTH; i++) {
            arrayFigure[i] = new FigureSupplier().getRandomFigure();
            arrayFigure[i].setRandomParameter();
            arrayFigure[i + FIGURES_LENGTH] = new FigureSupplier().getDefaultFigure();
        }
        for (int i = 0; i < FIGURES_LENGTH * 2; i++) {
            arrayFigure[i].getDraw();
        }
    }
}
