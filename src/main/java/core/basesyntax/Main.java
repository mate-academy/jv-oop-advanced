package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int NUMBER_OF_FIGURES = 20;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier(random, new ColorSupplier(random));
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];

        for (int i = 0; i < NUMBER_OF_FIGURES; i++) {
            if (figures.length / 2 > i) {
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
