package core.basesyntax;

import java.util.Random;

public class Main {
    static final Random random = new Random();
    private static final int NUMBER_OF_FIGURES = 10;
    static final ColorSupplier colorSupplier = new ColorSupplier(random);
    static final FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (i < NUMBER_OF_FIGURES / 2) {
                figures[i] = figureSupplier.getRandomFigure();
                figures[i].draw();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
                figures[i].draw();
            }
        }
    }
}
