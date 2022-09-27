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
                return new Circle(colorSupplier.getRandomColor(), randomizer.nextInt(MAX_VALUE));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), randomizer.nextInt(MAX_VALUE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),randomizer.nextInt(MAX_VALUE),
                        randomizer.nextInt(MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomizer.nextInt(MAX_VALUE), randomizer.nextInt(MAX_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomizer.nextInt(MAX_VALUE), randomizer.nextInt(MAX_VALUE));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }
}
