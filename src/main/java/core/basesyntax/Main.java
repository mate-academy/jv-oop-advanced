package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int RANDOM_RANGE = 20;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        ColorSupplier colorSupplier = new ColorSupplier();
        Figure[] figures = new Figure[random.nextInt(RANDOM_RANGE)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].setColor(colorSupplier.getRandomColor());
            figures[i].draw();
        }
    }
}
