package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX = 20;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(MAX)];

        for (int i = 0; i < figures.length; i++) {
            figures[i] = FigureSupplier.figureRand();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
