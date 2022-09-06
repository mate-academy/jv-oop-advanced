package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private final Random randomizer = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Shape randomShape = Shape.values()[randomizer.nextInt(Shape.values().length)];
        switch (randomShape) {
            case CIRCLE:
                return new Circle(randomizer.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(randomizer.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(randomizer.nextInt(MAX_VALUE), randomizer.nextInt(MAX_VALUE),
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomizer.nextInt(MAX_VALUE),
                        randomizer.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomizer.nextInt(MAX_VALUE),
                        randomizer.nextInt(MAX_VALUE), colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, Color.WHITE.name().toLowerCase());
    }
}
