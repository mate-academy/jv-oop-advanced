package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class MainClass {
    public static void main(String[] args) {
        Random random = new Random();
        final int arrayOfFigureLength = random.nextInt(15) + 1;
        Figure [] array = new Figure[arrayOfFigureLength];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < array.length; i++) {
            array[i] = figureSupplier.getRandomFigure();
        }
        for (int i = 0; i < array.length; i++) {
            array[i].draw();
        }
    }
}
