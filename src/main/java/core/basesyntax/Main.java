package core.basesyntax;

import core.basesyntax.figures.AbstractFigure;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        AbstractFigure[] figures = new AbstractFigure[ARRAY_SIZE];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = (i < figures.length / 2) ? figureSupplier.getRandomFigure()
                    : figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
