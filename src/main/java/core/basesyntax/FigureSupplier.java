package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 15;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);

        switch (FigureType.values()[index]) {
            case CIRCLE:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE)
                );
            case SQUARE:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE)
                );
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE)
                );
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE)
                );
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE)
                );
            default:
                throw new RuntimeException("This object is not a required type");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
