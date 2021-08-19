package core.basesyntax;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int constNumber = 10;
        Figure[] figures = new Figure[new Random().nextInt(constNumber)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (Figure figure : figures) {
            figure = figureSupplier.getRandomFigure();
            System.out.println(figure.getInformation());
        }
    }
}
