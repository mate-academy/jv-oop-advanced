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
                figure = new Circle(color, firstSize);
                break;
            case SQUARE:
                figure = new Square(color, firstSize);
                break;
            case RECTANGLE:
                figure = new Rectangle(color, firstSize, random.nextInt(MAX_RANDOM_NUBMER));
                break;
            case TRIANGLE:
                figure = new RightTriangle(color, firstSize);
                break;
            case TRAPEZOID:
                figure = new IsoscelesTrapezoid(color, firstSize, random.nextInt(MAX_RANDOM_NUBMER),
                        random.nextInt(MAX_RANDOM_NUBMER));
                break;
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
