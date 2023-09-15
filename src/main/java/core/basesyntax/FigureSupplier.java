package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int RANGE = 101;

    public Figure getRandomFigure() {
        Type figure = Type.values()[RANDOM.nextInt(Type.values().length)];
        switch (figure) {
            case SQUARE: {
                return new Square(RANDOM.nextInt(RANGE),
                        COLOR_SUPPLIER.getRandomColor());
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(RANDOM.nextInt(RANGE),
                        RANDOM.nextInt(RANGE), RANDOM.nextInt(RANGE),
                        COLOR_SUPPLIER.getRandomColor());
            }
            case CIRCLE: {
                return new Circle(RANDOM.nextInt(RANGE),
                        COLOR_SUPPLIER.getRandomColor());
            }
            case RESTANGLE: {
                return new Rectangle(RANDOM.nextInt(RANGE),RANDOM.nextInt(RANGE),
                        COLOR_SUPPLIER.getRandomColor());
            }
            default: {
                return new RightTriangle(RANDOM.nextInt(RANGE),
                        RANDOM.nextInt(RANGE),
                        COLOR_SUPPLIER.getRandomColor());
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10, Color.WHITE);
        return circle;
    }
}
