package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_ARRAY_SIZE = 20;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();

        Figure[] figureArray = new Figure[random.nextInt(MAX_ARRAY_SIZE + 1)];

        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = figureSupplier.getRandomFigure();
            figureArray[i].draw();
        }
    }
}
