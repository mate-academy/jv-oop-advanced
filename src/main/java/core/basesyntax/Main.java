package core.basesyntax;

import core.basesyntax.figures.Figure;
import java.util.Random;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier(random);
    private static final FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        System.out.println(); // to separate generated figures from default figures
        for (int i = NUMBER_OF_FIGURES / 2; i < NUMBER_OF_FIGURES; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
            figures[i].draw();
        }
    }
}
