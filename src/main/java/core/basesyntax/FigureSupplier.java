package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random;
    private int numFigures;
    private final double defaultRadius = 10.0;
    private final int maxRandomValue = 10;
    private ColorSupplier colorSupplier;
    private final ColorSupplier.Color defaultColor = ColorSupplier.Color.BLACK;

    public FigureSupplier() {
        random = new Random();
        numFigures = 4;
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        double randomValue = getRandomValue();
        ColorSupplier.Color color = colorSupplier.getRandomColor();

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
            case 4:
                return new IsoscelesTrapezoid(randomValue, randomValue, randomValue, color);
            default:
                throw new IllegalStateException("Invalid random number: " + randomNumber);
        }
    }

    private double getRandomValue() {
        return random.nextDouble() * maxRandomValue;
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, defaultColor);
    }
}
