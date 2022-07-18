package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 256;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private int getRandomInt() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE: {
                return new Circle(getRandomInt(), colorSupplier.getRandomColor());
            }
            case SQUARE: {
                return new Square(getRandomInt(), colorSupplier.getRandomColor());
            }
            case RECTANGLE: {
                return new Rectangle(getRandomInt(), getRandomInt(),
                        colorSupplier.getRandomColor());
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(getRandomInt(), colorSupplier.getRandomColor());
            }
            case ISOSCELES_TRAPEZOID:
            default: {
                return new IsoscelesTrapezoid(getRandomInt(),
                        getRandomInt(), colorSupplier.getRandomColor());
            }
        }
    }
}
