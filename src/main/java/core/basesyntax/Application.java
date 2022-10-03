package core.basesyntax;

import java.util.Random;

public class Application {
    private static final int LENGTH = 10;

    public static void main(String[] args) {
        Integer a = Integer.getInteger("3");
        Figure[] figures = new Figure[LENGTH];
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier(random, colorSupplier);
        for (int i = 0; i < LENGTH; i = i + 2) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i + 1] = figureSupplier.getDefaultFigure();
            figures[i].draw();
            figures[i + 1].draw();
        }
    }
}
