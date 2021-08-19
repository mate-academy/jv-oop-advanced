package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int SIZE_OF_ARRAY = 5;
        Random random = new Random();

        int arraySize = random.nextInt(SIZE_OF_ARRAY) + 1;
        Figure[] figures = new Figure[arraySize];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
