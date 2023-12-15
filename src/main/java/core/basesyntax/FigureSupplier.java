package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int NUM_FIGURES = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";

    public static Figure getRandomFigure() {
        double randomValue = getRandomValue();
        String color = ColorSupplier.getRandomColor();

        int randomNumber = random.nextInt(NUM_FIGURES);

        switch (randomNumber) {
            case 0:
                return new Square(randomValue, color);
            case 1:
                return new Rectangle(randomValue, randomValue, color);
            case 2:
                return new RightTriangle(randomValue, randomValue, color);
            case 3:
                return new Circle(randomValue, color);
            case 4:
                return new IsoscelesTrapezoid(randomValue, randomValue, randomValue, color);
            default:
                return null;
        }
    }

    public static Figure getDefaultFigure() {

        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private static double getRandomValue() {
        return random.nextDouble() * 10;
    }
}

