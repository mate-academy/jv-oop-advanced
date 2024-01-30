package core.basesyntax;

import java.util.Arrays;
import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[new Random().nextInt(50)];
        int avenger = figures.length / 2;
        for (int i = 0; i < figures.length; i++) {
            if (i < avenger) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        System.out.println(Arrays.toString(figures));
    }
}
