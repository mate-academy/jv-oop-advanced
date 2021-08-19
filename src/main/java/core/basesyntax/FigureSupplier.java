package main.java.core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_COUNTER = 10;
    private Random random = new Random();

    private int getSmallerRandomNumber() {
        return random.nextInt(RANDOM_COUNTER) + 1;
    }

    private int getBiggerRandomNumber() {
        return random.nextInt(RANDOM_COUNTER) + 11;
    }

    public Figure getRandomFigure() {
        String[] figure = {"Circle", "IsoscelesTrapezoid", "Rectangle", "RightTriangle", "Square"};
        int i = random.nextInt(figure.length);
        switch (i) {
            case 0 :
                return new Circle(ColorSupplier.getRandomColor(),
                        getSmallerRandomNumber());
            case 1:
                return new IsoscelesTrapezoid(ColorSupplier.getRandomColor(),
                        getSmallerRandomNumber(),
                        getBiggerRandomNumber(),
                        getSmallerRandomNumber());
            case 2:
                return new Rectangle(ColorSupplier.getRandomColor(),
                        getBiggerRandomNumber(),
                        getSmallerRandomNumber());
            case 3:
                return new RightTriangle(ColorSupplier.getRandomColor(),
                        getSmallerRandomNumber(),
                        getSmallerRandomNumber());

            default:
                return new Square(ColorSupplier.getRandomColor(),
                        getSmallerRandomNumber());
        }
    }
}
