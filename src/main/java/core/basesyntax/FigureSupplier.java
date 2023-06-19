package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_SIZE = 100;
    public static final int DEFAULT_RADIUS = 10;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Shape randomShape = Shape.values()[random.nextInt(Shape.values().length)];
        Color randomColor = Color.valueOf(colorSupplier.getRandomColor());

        switch (randomShape) {
            case CIRCLE:
                return new Circle(randomColor, random.nextInt(MAX_SIZE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randomColor,
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case RECTANGLE:
                return new Rectangle(randomColor,
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(randomColor,
                        random.nextInt(MAX_SIZE),
                        random.nextInt(MAX_SIZE));
            case SQUARE:
                return new Square(randomColor,
                        random.nextInt(MAX_SIZE));
            default:
                throw new RuntimeException("Something went wrong! Unknown figure shape: "
                        + randomShape);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
