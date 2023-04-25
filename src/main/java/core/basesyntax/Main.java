package core.basesyntax;

import core.basesyntax.figures.Figure;
import java.util.Random;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        final Random random = new Random();
        final ColorSupplier colorSupplier = new ColorSupplier(random);
        final FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        System.out.println();
        for (int i = NUMBER_OF_FIGURES / 2; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
