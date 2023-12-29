package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random;
    private final int numFigures = 4;
    private final double defaultRadius = 10.0;
    private final int maxRandomValue = 10;
    private ColorSupplier colorSupplier;
    private final String defaultColor = Color.YELLOW.name();

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        double randomValue = getRandomValue();
        String color = String.valueOf(colorSupplier.getRandomColor());

        int randomNumber = random.nextInt(numFigures + 1);

        switch (randomNumber) {
            case 0:
                return new Square(randomValue, color);
            case 1:
                return new Rectangle(randomValue, randomValue, color);
            case 2:
                return new RightTriangle(randomValue, randomValue, color);
            case 3:
                return new Circle(randomValue, color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, defaultColor);
    }

    private double getRandomValue() {
        return random.nextDouble() * maxRandomValue;
    }
}
