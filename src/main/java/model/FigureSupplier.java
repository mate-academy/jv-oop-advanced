package model;

import java.util.Random;

public class FigureSupplier {
    static final int RANDOM_LIMIT = 101;
    static final int PARAMETRS_COUNT = 3;
    static final int[] finalInt = new int[PARAMETRS_COUNT];

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        for (int i = 0; i < PARAMETRS_COUNT; i++) {
            finalInt[i] = random.nextInt(RANDOM_LIMIT) + 1;
        }
        switch (random.nextInt() % 5) {
            case (0):
                return new Circle(finalInt, colorSupplier.getRandomColor());
            case (1):
                return new IsoscelesTrapezoid(finalInt, colorSupplier.getRandomColor());
            case (2):
                return new Rectangle(finalInt, colorSupplier.getRandomColor());
            case (3):
                return new RightTriangle(finalInt, colorSupplier.getRandomColor());
            default:
                return new Square(finalInt, colorSupplier.getRandomColor());
        }
    }
}
