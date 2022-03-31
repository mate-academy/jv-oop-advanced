package core.basesyntax;

import core.basesyntax.figure.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int ARRAY_LENGTH = 3;

    public static void main(String[] args) {
        Figure[] arrayFigure = new Figure[ARRAY_LENGTH * 2];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            arrayFigure[i] = new FigureSupplier().getRandomFigure();
            arrayFigure[i].setRandomParameter();
            arrayFigure[i + ARRAY_LENGTH] = new FigureSupplier().getDefaultFigure(arrayFigure[i].name);
            arrayFigure[i + ARRAY_LENGTH].setDefaultParameter();
        }
        for (int i = 0; i < ARRAY_LENGTH * 2; i++) {
            arrayFigure[i].getDraw();
        }
    }
}
