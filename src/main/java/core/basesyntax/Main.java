package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int MAX_SIZE_OF_ARRAY = 10;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[random.nextInt(MAX_SIZE_OF_ARRAY) + 1];
        for (int i = 0; i < figure.length; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].getInfo();
        }
    }
}
