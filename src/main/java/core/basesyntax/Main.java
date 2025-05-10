package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int MAX_FIGURE_COUNT = 100;

    public static void main(String[] args) {
        Random random = new Random();

        Figure[] totalFigures = new Figure[random.nextInt(MAX_FIGURE_COUNT)];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < totalFigures.length; i++) {
            totalFigures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure: totalFigures) {
            figure.getDraw();
        }
    }
}
