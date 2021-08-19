package core.basesyntax;

import java.util.Random;

public class Main {
    static final int SIZE_OF_ARRAY = 10;
    private static Random random = new Random();

    public static void main(String[] args) {
        int arraySize = random.nextInt(SIZE_OF_ARRAY);
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
