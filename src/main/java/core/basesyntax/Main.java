package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int MAX_LENGTH = 25;

    public static void main(String[] args) {
        Random random = new Random();
        Figure[] figures = new Figure[random.nextInt(MAX_LENGTH)];
        FigureSupplier figureSupplier = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
