package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    Figure getRandomFigure() {
        switch (FigureType.values()[random.nextInt(FigureType.values().length)]) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_RANDOM_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE), random.nextInt(MAX_RANDOM_VALUE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE), random.nextInt(MAX_RANDOM_VALUE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_RANDOM_VALUE), random.nextInt(MAX_RANDOM_VALUE),
                        random.nextInt(MAX_RANDOM_VALUE));
        }
    }

    Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
