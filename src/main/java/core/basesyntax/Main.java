package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Figure[] figures = new Figure[10];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = i < figures.length / 2
                    ? supplier.getRandomFigure() : supplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
