package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int MAX_SIZE_OF_ARRAY = 20;

    public static void main(String[] args) {
        Random random = new Random();
        int arraySize = random.nextInt(MAX_SIZE_OF_ARRAY) + 1;
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].drawFigure();
        }
    }
}
