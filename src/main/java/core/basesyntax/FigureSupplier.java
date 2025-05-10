package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_LEG_LENGTH = 1;
    private static final int MAX_LEG_LENGTH = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureTypes type = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        switch (type) {
            case SQUARE:
                return new Square(
                    getRandomInt(),
                    colorSupplier.getRandomColor()
                );
            case RECTANGLE:
                return new Rectangle(
                    getRandomInt(),
                    getRandomInt(),
                    colorSupplier.getRandomColor()
                );
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                    getRandomInt(),
                    getRandomInt(),
                    colorSupplier.getRandomColor()
                );
            case CIRCLE:
                return new Circle(
                    getRandomInt(),
                    colorSupplier.getRandomColor()
                );
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                    getRandomInt(),
                    getRandomInt(),
                    getRandomInt(),
                    colorSupplier.getRandomColor()
                );
            default:
                throw new IllegalStateException(type.name());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int getRandomInt() {
        return random.nextInt(MIN_LEG_LENGTH, MAX_LEG_LENGTH);
    }
}
