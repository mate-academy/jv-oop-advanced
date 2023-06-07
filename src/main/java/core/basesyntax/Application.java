package core.basesyntax;

import java.util.Random;

public class Application {
    private static final Random RANDOM = new Random();
    private static final int FIGURES_COUNT = 10;
    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {
        int randomNumber = RANDOM.nextInt(FIGURES_COUNT);
        int number = 0;
        for (int i = 0; i < randomNumber; i++) {
            Figure figure = figureSupplier.getRandomFigure();
            figure.draw();
            if (i == randomNumber / 2) {
                number = i;
            }
        }
        for (int i = number; i < randomNumber; i++) {
            Figure figure = figureSupplier.getDefaultFigure();
            figure.draw();
        }
    }
}
