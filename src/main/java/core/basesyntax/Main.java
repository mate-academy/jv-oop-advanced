package core.basesyntax;

import java.util.Random;

public class Main {
    private static FigureSupplier randomFigure = new FigureSupplier();

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(10)];
        for (int i = 0; i < figures.length / 2; i++) {
            figures[i] = randomFigure.getRandomFigure();
            figures[i].draw();
        }
        for (int i = figures.length / 2; i < figures.length; i++) {
            figures[i] = randomFigure.getDefaultFigure();
            figures[i].draw();
        }
    }
}
