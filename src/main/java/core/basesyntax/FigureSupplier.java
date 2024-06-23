package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    public static final double MAX_RANGE_VALUE = 100;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    public static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int indexRandom = RANDOM.nextInt(FigureType.values().length);
        String figureName = FigureType.values()[indexRandom].name();
        String randomColor = COLOR_SUPPLIER.getRandomColor();

        return switch (figureName) {
            case "SQUARE" -> new Square(randomColor,
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "RECTANGLE" -> new Rectangle(randomColor,
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "CIRCLE" -> new Circle(randomColor,
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "RIGHT_TRIANGLE" -> new RightTriangle(randomColor,
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "ISOSCELES_TRAPEZOID" -> new IsoscelesTrapezoid(randomColor,
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            default -> throw new IllegalStateException("Unexpected value: " + figureName);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
