package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int LIMIT = 10;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[LIMIT];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < LIMIT; i++) {
            if (i < LIMIT / 2) {
                figures[i] = figureSupplier.getRandomFigure(random, colorSupplier);
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
