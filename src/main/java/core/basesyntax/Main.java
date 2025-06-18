package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Figure[] listOfArray = new Figure[ARRAY_SIZE];
        FigureSupplier figure = new FigureSupplier();

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (i < ARRAY_SIZE / 2) {
                listOfArray[i] = figure.getRandomFigure();
            } else {
                listOfArray[i] = figure.getDefaultFigure();
            }
        }

        for (int i = 0; i < ARRAY_SIZE; i++) {
            listOfArray[i].draw();
        }
    }

}
