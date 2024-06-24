package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import java.util.Random;

public class FigureSupplier {
    public static final double MAX_RANGE_VALUE = 100;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    public static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexRandom = random.nextInt(FigureType.values().length);
        FigureType randomFigureType = FigureType.values()[indexRandom];
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigureType) {
            case SQUARE -> createSquare(randomColor);
            case RECTANGLE -> createRectangle(randomColor);
            case CIRCLE -> createCircle(randomColor);
            case RIGHT_TRIANGLE -> createRightTriangle(randomColor);
            case ISOSCELES_TRAPEZOID -> createIsoscelesTrapezoid(randomColor);
            default -> throw new IllegalStateException("Unexpected value: " + randomFigureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square createSquare(String color) {
        return new Square(color, random.nextDouble(MAX_RANGE_VALUE));
    }

    private RightTriangle createRightTriangle(String color) {
        return new RightTriangle(color,
                random.nextDouble(MAX_RANGE_VALUE),
                random.nextDouble(MAX_RANGE_VALUE),
                random.nextDouble(MAX_RANGE_VALUE));
    }

    private Rectangle createRectangle(String color) {
        return new Rectangle(color,
                random.nextDouble(MAX_RANGE_VALUE),
                random.nextDouble(MAX_RANGE_VALUE));
    }

    private Circle createCircle(String color) {
        return new Circle(color, random.nextDouble(MAX_RANGE_VALUE));
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color,
                random.nextDouble(MAX_RANGE_VALUE),
                random.nextDouble(MAX_RANGE_VALUE),
                random.nextDouble(MAX_RANGE_VALUE));
    }
}
