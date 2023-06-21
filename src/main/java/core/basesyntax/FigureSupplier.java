package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final Shape[] SHAPES = Shape.values();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        switch (SHAPES[random.nextInt(SHAPES.length)]) {
            case CIRCLE:
                return new Circle(random.nextInt(100), COLOR_SUPPLIER.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(random.nextInt(100),
                        random.nextInt(100), random.nextInt(10), COLOR_SUPPLIER.getRandomColor());
            case SQUARE:
                return new Square(random.nextInt(100), COLOR_SUPPLIER.getRandomColor());
            case RECTANGLE:
                return new Rectangle(random.nextInt(100),
                        random.nextInt(100), COLOR_SUPPLIER.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(random.nextInt(100),
                        random.nextInt(100), COLOR_SUPPLIER.getRandomColor());
            default: return new Figure();
        }
    }

}
