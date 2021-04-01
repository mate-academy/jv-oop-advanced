package core.basesyntax;

import java.util.Random;

public class Main {
    public static final int RANDOM_COUNT = 50;

    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[random.nextInt(RANDOM_COUNT)];

        for (int i = 0; i < figures.length;i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure: figures) {
            figure.draw();
        }
    }
}
