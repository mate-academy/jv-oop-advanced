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
                return new Circle(randomColor, getRandomDimension());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        getRandomDimension(),
                        getRandomDimension(),
                        getRandomDimension());
            case RECTANGLE:
                return new Rectangle(randomColor,
                        getRandomDimension(),
                        getRandomDimension());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        getRandomDimension(),
                        getRandomDimension());
            case SQUARE:
                return new Square(randomColor,
                        getRandomDimension());
            default:
                throw new RuntimeException("Something went wrong! Unknown figure shape: "
                        + randomShape);
        }
    }

    private int getRandomDimension() {
        return random.nextInt(MAX_SIZE);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
