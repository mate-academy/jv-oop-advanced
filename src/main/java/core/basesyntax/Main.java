package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_LENGTH_OF_ARRAY = 10;

    public static void main(String[] args) {

        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figure = new Figure[random.nextInt(MAX_LENGTH_OF_ARRAY)];
        for (int i = 0; i < figure.length; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].getInfo();
        }
    }
}
