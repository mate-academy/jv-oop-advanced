package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR  = Color.WHITE.name();
    private final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private static final int MAX_RANDOM_NUBMER = 100;

    public Figure getRandomFigure() {
        Figure figure;
        Shape shape = Shape.values()[random.nextInt(Shape.values().length)];
        String color = colorSupplier.getRandomColor();
        int firstSize = random.nextInt(MAX_RANDOM_NUBMER);
        switch (shape) {
            case CIRCLE:
                return new Circle(color, firstSize);
            case SQUARE:
                return new Square(color, firstSize);
            case RECTANGLE:
                return new Rectangle(color, firstSize, random.nextInt(MAX_RANDOM_NUBMER));
            case TRIANGLE:
                return new RightTriangle(color, firstSize);
            case TRAPEZOID:
                return new IsoscelesTrapezoid(color, firstSize, random.nextInt(MAX_RANDOM_NUBMER),random.nextInt(MAX_RANDOM_NUBMER));
            default:
                figure = getDefaultFigure();
        }
        return figure;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private enum Shape { CIRCLE, SQUARE, RECTANGLE, TRIANGLE, TRAPEZOID }
}
