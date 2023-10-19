package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (FigureType.values()[random.nextInt(FigureType.values().length)]) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getDefaultColor(), DEFAULT_RADIUS);
    }
}
