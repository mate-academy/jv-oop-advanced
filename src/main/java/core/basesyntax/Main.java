package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_ARRAY_SIZE = 10;
    private static final FigureSupplier figureSupplier = new FigureSupplier();
    private static final Random random = new Random();

    public static void main(String[] args) {
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
