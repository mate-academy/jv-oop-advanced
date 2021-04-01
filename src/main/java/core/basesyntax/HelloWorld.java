package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (Figure currentFigure : figureSupplier.generateFigures()) {
            currentFigure.drawFigure();
        }
    }
}
