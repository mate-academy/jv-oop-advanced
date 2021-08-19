package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int CONST_NUMBER = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(CONST_NUMBER)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (Figure figure : figures) {
            figure = figureSupplier.getRandomFigure();
            System.out.println(figure.getInformation());
        }
    }
}
