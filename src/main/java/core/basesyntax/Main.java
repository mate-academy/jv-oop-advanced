package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int ARRAY_MAX_SIZE = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(ARRAY_MAX_SIZE)];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (Figure figure : figures) {
            figure = figureSupplier.getRandomFigure();
            System.out.println(figure.getInformation());
        }
    }
}
