package main.java.core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_COUNTER = 10;
    private static final int FIGURES_QUANTITY = 5;
    private Random random = new Random();
    private String color = ColorSupplier.getRandomColor();
    private int randomValue = getRandomNumber();

    private int getRandomNumber() {
        return random.nextInt(RANDOM_COUNTER) + 1;
    }

    public Figure getRandomFigure() {
        int i = random.nextInt(FIGURES_QUANTITY);
        switch (i) {
            case 0 :
                return new Circle(color, randomValue);
            case 1:
                return new IsoscelesTrapezoid(color, randomValue, randomValue, randomValue);
            case 2:
                return new Rectangle(color, randomValue, randomValue);
            case 3:
                return new RightTriangle(color, randomValue, randomValue);

            default:
                return new Square(color, randomValue);
        }
    }
}
