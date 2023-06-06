package core.basesyntax;

import java.util.Random;

public class Application {
    private static final Random random = new Random();
    private static final int figuresCount = 10;

    public static void main(String[] args) {
        int randomNumber = random.nextInt(figuresCount);
        int number = 0;
        FigureSupplier figureSupplier = new FigureSupplier();
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
