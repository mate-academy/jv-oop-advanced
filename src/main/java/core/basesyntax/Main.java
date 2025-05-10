package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int numberOfFigures = 6;
        for (int i = 0; i < numberOfFigures; i++) {
            if (i >= numberOfFigures / 2) {
                figureSupplier.getDefaultFigure().draw();
            } else {
                figureSupplier.getRandomFigure().draw();
            }
        }
    }
}
