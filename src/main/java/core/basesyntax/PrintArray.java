package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class PrintArray {
    public static void main(String[] args) {
        FigureSupplier[] arrayFigures = new FigureSupplier[6];
        for (int i = 0; i < arrayFigures.length; i++) {
            arrayFigures[i] = new FigureSupplier();
        }
        for (FigureSupplier arrayFigure : arrayFigures) {
            arrayFigure.getRandomFigure().draw();
        }
    }
}
