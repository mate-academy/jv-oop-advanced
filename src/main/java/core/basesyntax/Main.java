package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random random = new Random();
        final ColorSupplier colorSupplier = new ColorSupplier(random);
        final FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        final Figure[] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures[i] = figureSupplier.getRandomFigure();
            } else {
                figures[i] = figureSupplier.getDefaultFigure();
            }

        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
