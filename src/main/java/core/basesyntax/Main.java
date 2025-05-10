package core.basesyntax;

import core.basesyntax.random.FigureSupplier;

public class Main {
    private static final int ARRAY_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_SIZE];
        for (int i = 0; i < figures.length; i++) {
            if (i >= ARRAY_SIZE / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            }
        }
    }
}
