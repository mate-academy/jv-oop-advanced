package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        int countOfFigure = new Random().nextInt(10);
        Figure[] figure = new Figure[countOfFigure];

        for (int i = 0; i < countOfFigure; i++) {
            figure[i] = figureSupplier.getRandomFigure();
            figure[i].draw();
        }
    }
}
