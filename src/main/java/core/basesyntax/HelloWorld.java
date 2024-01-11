package core.basesyntax;

import java.util.Random;

public class HelloWorld {
    private static final int ARRAY_LENGTH_LIMIT = 10;

    public static void main(String[] args) {
        FigureSupplier supplier = new FigureSupplier();
        Random random = new Random();
        Shape[] shapes = new Shape[random.nextInt(ARRAY_LENGTH_LIMIT)];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = supplier.getRandomFigure();
        }

        for (Shape shaped : shapes) {
            System.out.println(shaped.draw());
        }
    }
}

