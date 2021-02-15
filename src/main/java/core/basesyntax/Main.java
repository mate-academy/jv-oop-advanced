package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Circle(9);

        FigureSupplier figureSupplier = new FigureSupplier();
        int countOfFigure = new Random().nextInt(10);
        Figure[] figure = new Figure[countOfFigure];

        for (int i = 0; i < countOfFigure; i++) {
            figure[i] = figureSupplier.get();
            figure[i].draw();
        }
    }
}
