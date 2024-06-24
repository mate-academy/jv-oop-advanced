package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import java.util.Random;

public class FigureSupplier {
    public static final double MAX_RANGE_VALUE = 100;
    public static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    public static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        int indexRandom = random.nextInt(FigureType.values().length);
        FigureType randomFigureType = FigureType.values()[indexRandom];
        String randomColor = colorSupplier.getRandomColor();

        return switch (randomFigureType) {
            case SQUARE -> new Square(randomColor,
                    random.nextDouble(MAX_RANGE_VALUE));
            case RECTANGLE -> new Rectangle(randomColor,
                    random.nextDouble(MAX_RANGE_VALUE),
                    random.nextDouble(MAX_RANGE_VALUE));
            case CIRCLE -> new Circle(randomColor,
                    random.nextDouble(MAX_RANGE_VALUE));
            case RIGHT_TRIANGLE -> new RightTriangle(randomColor,
                    random.nextDouble(MAX_RANGE_VALUE),
                    random.nextDouble(MAX_RANGE_VALUE),
                    random.nextDouble(MAX_RANGE_VALUE));
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(randomColor,
                    random.nextDouble(MAX_RANGE_VALUE),
                    random.nextDouble(MAX_RANGE_VALUE),
                    random.nextDouble(MAX_RANGE_VALUE));
            default -> throw new IllegalStateException("Unexpected value: " + randomFigureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
