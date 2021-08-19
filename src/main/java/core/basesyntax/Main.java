package core.basesyntax;

import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[getRandomArrayLength()];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
        }
        for (Figure figure : figures) {
            figure.draw();
        }
    }

    public static int getRandomArrayLength() {
        return random.nextInt(FigureSupplier.FIGURE_COUNT) + 1;
    }
}
