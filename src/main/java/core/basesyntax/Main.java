package core.basesyntax;

import java.lang.reflect.Array;

public class Main {
    private static final int MAX_SIZE = 6;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[MAX_SIZE];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else if (i >= figures.length / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
