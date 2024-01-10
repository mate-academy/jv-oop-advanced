package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUM_FIGURES = 5;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final String DEFAULT_COLOR = Color.YELLOW.name();
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        double randomValue = getRandomValue();
        String color = colorSupplier.getRandomColor();

        int randomNumber = random.nextInt(NUM_FIGURES + 1);

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
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR); // using name() instead of toString()
    }

    private double getRandomValue() {
        return random.nextDouble() * MAX_RANDOM_VALUE;
    }
}
