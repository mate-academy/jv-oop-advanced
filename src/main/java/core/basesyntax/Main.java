package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int FIGURE_COUNT = 20;
    private static Random random = new Random();

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int randomArrayLength = new Random().nextInt(FIGURE_COUNT) + 1;
        Figure[] figures = new Figure[randomArrayLength];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
