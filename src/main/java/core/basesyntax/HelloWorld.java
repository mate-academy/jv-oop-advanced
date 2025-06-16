package core.basesyntax;

import core.basesyntax.figures.Figure;
import core.basesyntax.suppliers.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {

        final int arraySize = 6;
        Figure[] listOfArray = new Figure[arraySize];
        FigureSupplier figure = new FigureSupplier();

        for (int i = 0; i < arraySize; i++) {
            if (i < arraySize / 2) {
                listOfArray[i] = figure.getRandomFigure();
            } else {
                listOfArray[i] = figure.getDefaultFigure();
            }
        }

        for (int i = 0; i < arraySize; i++) {
            listOfArray[i].draw();
        }
    }

}
