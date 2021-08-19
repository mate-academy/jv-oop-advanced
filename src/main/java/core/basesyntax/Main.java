package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_LENGTH = 10;

    public static void main(String[] args) {
        int arrayLength = new Random().nextInt(MAX_LENGTH);
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[arrayLength];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
