package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAXIMUM_VALUE = 50;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[index];

        String randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case CIRCLE:
                return new Circle(randomColor, randomSize());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        randomSize(), randomSize(), randomSize());
            case RECTANGLE:
                return new Rectangle(randomColor, randomSize(), randomSize());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor, randomSize());
            case SQUARE:
            default:
                return new Square(randomColor, randomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double randomSize() {
        return random.nextInt() * MAXIMUM_VALUE;
    }
}
