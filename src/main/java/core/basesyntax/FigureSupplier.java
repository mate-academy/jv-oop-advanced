package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Shape randomShape = Shape.values()[random.nextInt(Shape.values().length)];
        Color randomColor = Color.valueOf(colorSupplier.getRandomColor());

        switch (randomShape) {
            case CIRCLE:
                return new Circle(randomColor, getRandomSize());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        getRandomSize(),
                        getRandomSize(),
                        getRandomSize());
            case RECTANGLE:
                return new Rectangle(randomColor,
                        getRandomSize(),
                        getRandomSize());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        getRandomSize(),
                        getRandomSize());
            case SQUARE:
                return new Square(randomColor,
                        getRandomSize());
            default:
                throw new RuntimeException("Something went wrong! Unknown figure shape: "
                        + randomShape);
        }
    }

    private int getRandomSize() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
