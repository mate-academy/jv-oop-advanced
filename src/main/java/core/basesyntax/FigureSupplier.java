package core.basesyntax;

import core.basesyntax.enums.FigureType;
import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final double MAX_RANGE_VALUE = 100;

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int indexRandom = RANDOM.nextInt(FigureType.values().length);
        String figureName = FigureType.values()[indexRandom].name();

        return switch (figureName) {
            case "SQUARE" -> new Square(colorSupplier.getRandomColor(),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "RECTANGLE" -> new Rectangle(colorSupplier.getRandomColor(),
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "CIRCLE" -> new Circle(colorSupplier.getRandomColor(),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "RIGHT_TRIANGLE" -> new RightTriangle(colorSupplier.getRandomColor(),
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            case "ISOSCELES_TRAPEZOID" -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE),
                    RANDOM.nextDouble(MAX_RANGE_VALUE));
            default -> throw new IllegalStateException("Unexpected value: " + figureName);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
