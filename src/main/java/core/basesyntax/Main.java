package core.basesyntax;

import core.basesyntax.figures.FigureSupplier;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < 3; i++) {
            new FigureSupplier().getDefaultFigure().draw();
            new FigureSupplier().getRandomFigure().draw();
        }
    }
}
