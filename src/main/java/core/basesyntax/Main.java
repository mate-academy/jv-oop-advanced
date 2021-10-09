package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(MAX_ARRAY_SIZE)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
            System.out.println();
        }
    }
}
