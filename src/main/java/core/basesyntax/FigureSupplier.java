package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private  static final Random RANDOM = new Random();
    private static final Shape[] SHAPES = Shape.values();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        switch (SHAPES[RANDOM.nextInt(SHAPES.length)]) {
            case CIRCLE: return new Circle(RANDOM.nextInt(100),  COLOR_SUPPLIER.getRandomColor());
            case ISOSCELES_TRAPEZOID: return new IsoscelesTrapezoid(RANDOM.nextInt(100),
                    RANDOM.nextInt(100), RANDOM.nextInt(10), COLOR_SUPPLIER.getRandomColor());
            case SQUARE: return new Square(RANDOM.nextInt(100), COLOR_SUPPLIER.getRandomColor());
            case RECTANGLE: return new Rectangle(RANDOM.nextInt(100),
                    RANDOM.nextInt(100), COLOR_SUPPLIER.getRandomColor());
            case RIGHT_TRIANGLE: return new RightTriangle(RANDOM.nextInt(100),
                    RANDOM.nextInt(100), COLOR_SUPPLIER.getRandomColor());
        }
        return new Figure();
    }
}
