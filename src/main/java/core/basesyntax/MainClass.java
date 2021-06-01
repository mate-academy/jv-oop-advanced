package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class MainClass {
    public static void main(String[] args) {
        Random rnd = new Random();
        Figure [] array = new Figure[rnd.nextInt(15) + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = new FigureSupplier().getRandomFigure();
        }
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            array[i].draw();
        }
    }
}
