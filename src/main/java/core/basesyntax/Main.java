package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier(random);
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        Figure [] figures = new Figure[6];

        for (int i = 0; i < figures.length; i++) {
            if (i < 3) {
                figures [i] = figureSupplier.getRandomFigure();
            } else {
                figures [i] = figureSupplier.defaultFigure();
            }
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
