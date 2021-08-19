package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int RANDOM_FIGURES_NUMBERS = 100;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(RANDOM_FIGURES_NUMBERS)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
