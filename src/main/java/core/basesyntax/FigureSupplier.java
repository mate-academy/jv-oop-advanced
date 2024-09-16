package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SHAPE_RANDOM_BOUND = FigureEnum.values().length;
    private static final int VALUE_RANDOM_BOUND = 20;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureEnum figure = FigureEnum.values()[random.nextInt(SHAPE_RANDOM_BOUND)];
        String color = colorSupplier.getRandomColor();
        switch (figure) {
            case CIRCLE: {
                int radius = generateRandomValue();
                return new Circle(color, radius);
            }
            case ISOSCELES_TRAPEZOID: {
                int firstBase = generateRandomValue();
                int secondBase = generateRandomValue();
                int height = generateRandomValue();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            }
            case RECTANGLE: {
                int height = generateRandomValue();
                int width = generateRandomValue();
                return new Rectangle(color, height, width);
            }
            case RIGHT_TRIANGLE: {
                int firstLeg = generateRandomValue();
                int secondLeg = generateRandomValue();
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            default: {
                int side = generateRandomValue();
                return new Square(color, side);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }

    private int generateRandomValue() {
        return random.nextInt(VALUE_RANDOM_BOUND);
    }
}
