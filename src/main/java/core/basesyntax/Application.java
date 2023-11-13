package core.basesyntax;

import java.util.Random;

public class Application {
    private static final Random RANDOM_NUMBER = new Random();
    private static final int ARRAY_LENGTH = RANDOM_NUMBER.nextInt(10);

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_LENGTH];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (i <= ARRAY_LENGTH / 2) {
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
