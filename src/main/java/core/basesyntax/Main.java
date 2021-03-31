package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int maxArray = 100;

    public static void main(String[] args) {
        Random random = new Random();

        Figure[] figures = new Figure[random.nextInt(maxArray)];
        FigureSupplier choseFigure = new FigureSupplier();

        for (int i = 0; i < figures.length; i++) {
            figures[i] = choseFigure.getRandomFigure();
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }

}
