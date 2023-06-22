package core.basesyntax;

import java.util.Arrays;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int FIGURE_ARRAY_LENGTH = 6;
    private static final int MIDDLE_FIGURE_ARRAY_LENGTH = 3;

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[FIGURE_ARRAY_LENGTH];
        for (int index = 0; index < figures.length; ++index) {
            if (index < MIDDLE_FIGURE_ARRAY_LENGTH) {
                figures[index] = figureSupplier.getDefaultFigure();
            } else {
                figures[index] = figureSupplier.getRandomFigure();
            }
        }
        System.out.println(Arrays.toString(figures));
    }
}
