package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        final int RANDOM_RANGE = 10;
        int arraySize = random.nextInt(RANDOM_RANGE) + 1;
        Figure[] figures = new Figure[arraySize];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
