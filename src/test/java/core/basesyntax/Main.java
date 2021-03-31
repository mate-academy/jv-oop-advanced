package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX = 20;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figure = new Figure[random.nextInt(MAX)];

        for (int i = 0; i < figure.length; i++) {
            figure[i] = FigureSupplier.figureRand();

        }

        for (Figure figurs: figure) {
            figurs.draw();

        }
    }
}
