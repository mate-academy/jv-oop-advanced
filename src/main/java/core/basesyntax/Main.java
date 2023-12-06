package core.basesyntax;

import core.basesyntax.figures.Figure;
import java.util.Random;

public class Main {
    private static final int NUMBER_OF_FIGURES = 6;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
            figures[i].draw();
        }
    }
}
