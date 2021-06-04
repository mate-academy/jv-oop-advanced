package core.basesyntax;

import core.basesyntax.suppliers.FigureSupplier;

public class Main {
    public static final int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
