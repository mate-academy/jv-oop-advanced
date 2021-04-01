package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int FIGURES_NUMBER_LIMIT = 10;

    public static void main(String[] args) {
        Random random = new Random();
        int count = random.nextInt(FIGURES_NUMBER_LIMIT);
        Figure[] figures = new Figure[count];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().createFigure();
        }

        for (int i = 0; i < figures.length; i++) {
            figures[i].draw();
        }
    }
}
