package core.basesyntax;

import java.util.Random;

public class FigureArray {
    private static final int ARRAY_LENGTH = 14;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] array = new Figure[random.nextInt(ARRAY_LENGTH)];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array[i] = figureSupplier.getRandomFigure();
                array[i].draw();
            } else {
                array[i] = figureSupplier.getDefaultFigure();
                array[i].draw();
            }
        }
    }
}
