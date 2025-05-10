package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND_100 = 100;
    private static final int BOUND_10 = 10;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final Shape[] SHAPES = Shape.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        switch (SHAPES[random.nextInt(SHAPES.length)]) {
            case CIRCLE:
                return new Circle(random.nextInt(BOUND_100), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(BOUND_100),
                        random.nextInt(BOUND_100), random.nextInt(BOUND_10),
                        colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(random.nextInt(BOUND_100), colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(BOUND_100),
                        random.nextInt(BOUND_100), colorSupplier.getRandomColor());
            default: return new RightTriangle(random.nextInt(BOUND_100),
                        random.nextInt(BOUND_100), colorSupplier.getRandomColor());
        }
    }
}
