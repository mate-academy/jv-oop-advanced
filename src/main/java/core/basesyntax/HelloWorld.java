package core.basesyntax;

import java.util.Arrays;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[6];
        for (int index = 0; index < figures.length; ++index) {
            if (index < 3) {
                figures[index] = figureSupplier.getDefaultFigure();
            } else {
                figures[index] = figureSupplier.getRandomFigure();
            }
        }
        System.out.println(Arrays.toString(figures));
    }
}
