package core.basesyntax;

import java.util.Random;

public class HelloWorld {
    private static final int ARRAY_LIMIT = 15;

    public static void main(String[] args) {
        Figure[] figures = new Figure[new Random().nextInt(ARRAY_LIMIT) + 1];
        FigureSupplier supplier = new FigureSupplier();
        for (int i = 0; i < figures.length; i++) {
            figures[i] = supplier.getRandomFigure();
        }

        for (Figure figure : figures) {
            System.out.println(figure.draw());
        }
    }
}
