package core.basesyntax.figure;

import core.basesyntax.color.Color;
import core.basesyntax.color.ColorSupplier;
import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_MAX_VALUE = 100;
    private final Random random = new Random(System.currentTimeMillis());
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        Shape shape = Shape.values()[random.nextInt(Shape.values().length)];

        switch (shape) {
            case CIRCLE: {
                return new Circle(color, random.nextInt(RANDOM_MAX_VALUE));
            }
            case SQUARE: {
                return new Square(color, random.nextInt(RANDOM_MAX_VALUE));
            }
            case RECTANGLE: {
                return new Rectangle(color, random.nextInt(RANDOM_MAX_VALUE),
                        random.nextInt(RANDOM_MAX_VALUE));
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(color, random.nextInt(RANDOM_MAX_VALUE),
                        random.nextInt(RANDOM_MAX_VALUE));
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(random.nextInt(RANDOM_MAX_VALUE),
                        random.nextInt(RANDOM_MAX_VALUE), random.nextInt(RANDOM_MAX_VALUE));
            }
            default: {
                return getDefaultFigure();
            }
        }
    }
}
