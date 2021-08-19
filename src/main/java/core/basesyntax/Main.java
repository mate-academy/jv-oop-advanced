package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int RANDOM_FIGURES_NUMBERS = 100;

    public static void main(String[] args) {
        Figure[] figureS = new Figure[new Random().nextInt(RANDOM_FIGURES_NUMBERS)];
        for (int i = 0; i < figureS.length; i++) {
            figureS[i] = new FigureSupplier().getRandomFigure();
            figureS[i].draw();
        }
    }
}
