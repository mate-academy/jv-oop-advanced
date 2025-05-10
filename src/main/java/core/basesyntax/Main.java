package core.basesyntax;

import java.util.Random;

public class Main {
    private static final int ARRAY_LIMIT = 10;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(ARRAY_LIMIT)];
        for (int i = 0; i < figures.length; i++) {
            figures[i] = new FigureSupplier().createRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.drawFigure());
        }
    }
}
