package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = ColorSupplier.Color.WHITE.toString();
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        Random random = new Random();
        Shape shape = Shape.values()[random.nextInt(Shape.values().length)];
        String color = new ColorSupplier().getRandomColor();
        int firstSize = random.nextInt(Figure.MAX_SIDE);
        switch (shape) {
            case CIRCLE:
                return new Circle(color, firstSize);
            case SQUARE:
                return new Square(color, firstSize);
            case RECTANGLE:
                return new Rectangle(color, firstSize, random.nextInt(Figure.MAX_SIDE));
            case TRIANGLE:
                return new RightTriangle(color, firstSize);
            case TRAPEZOID:
            default:
                return new IsoscelesTrapezoid(color,
                        firstSize,
                        random.nextInt(Figure.MAX_SIDE),
                        random.nextInt(Figure.MAX_SIDE)
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private enum Shape { CIRCLE, SQUARE, RECTANGLE, TRIANGLE, TRAPEZOID }
}
