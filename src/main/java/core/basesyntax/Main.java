package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int RANDOM_RANGE = 100;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(RANDOM_RANGE) + 1];
        ColorSupplier colorSupplier = new ColorSupplier();
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].setColor(colorSupplier.getRandomColor());
            figures[i].draw();
        }
    }
}
