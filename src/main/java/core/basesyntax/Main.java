package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int RANGE = 10;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        int arraySize = random.nextInt(RANGE) + 1;
        Figure[] figures = new Figure[arraySize];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
