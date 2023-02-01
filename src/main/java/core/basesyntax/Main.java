package core.basesyntax;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        FigureSupplier figureSupplier = new FigureSupplier();
        Random random = new Random();
        int figureSize = random.nextInt(5);

        Figure[] figures = new Figure[figureSize];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
    }
}
