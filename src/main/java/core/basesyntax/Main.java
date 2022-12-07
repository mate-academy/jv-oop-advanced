package core.basesyntax;

import java.util.Random;

/**
 * Feel free to remove this class and create your own.
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        FigureSupplier randomFigure = new FigureSupplier();
        Figure[] figures = new Figure[random.nextInt(10)];

        for (int i = 0; i < figures.length; i++) {
            if (i < figures.length / 2) {
                figures[i] = randomFigure.getRandomFigure();
                figures[i].getDrawing();
            } else {
                figures[i] = randomFigure.getDefaultFigure();
                figures[i].getDrawing();
            }
        }
    }
}
