package core.basesyntax;

import core.basesyntax.util.ColorSupplier;
import core.basesyntax.util.FigureSupplier;
import java.util.Random;

public class Main {
    private static final int DEFAULT_ARRAY_SIZE = 6;

    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);

        Figure[] figures = new Figure[DEFAULT_ARRAY_SIZE];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = figureSupplier.getDefaultFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
