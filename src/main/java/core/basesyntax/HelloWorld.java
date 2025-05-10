package core.basesyntax;

import java.util.Arrays;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    private static final int FIGURES_ARRAY_LENGTH = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[FIGURES_ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            if (i <= 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }

        Arrays.stream(figures).forEach(Figure::draw);
    }
}
