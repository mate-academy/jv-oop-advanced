package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_RANDOM_VALUE = 10;
    private static final double MIN_RANDOM_VALUE = 1;

    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureTypes type = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        String color = colorSupplier.getRandomColor();

        double randomValue1 = random.nextDouble() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE)
                + MIN_RANDOM_VALUE;
        double randomValue2 = random.nextDouble() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE)
                + MIN_RANDOM_VALUE;
        double randomValue3 = random.nextDouble() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE)
                + MIN_RANDOM_VALUE;

        switch (type) {
            case SQUARE:
                return new Square(color,randomValue1);
            case RECTANGLE:
                return new Rectangle(color, randomValue1, randomValue2);
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, randomValue1, randomValue2);
            case CIRCLE:
                return new Circle(color, randomValue1);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, randomValue1, randomValue2, randomValue3);
            default:
                throw new IllegalStateException("Unknown type of figure: " + type);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
