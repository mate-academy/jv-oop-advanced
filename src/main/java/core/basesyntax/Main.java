package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_ARRAY_SIZE = 10;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        int arraySize = random.nextInt(1, MAX_ARRAY_SIZE);
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
