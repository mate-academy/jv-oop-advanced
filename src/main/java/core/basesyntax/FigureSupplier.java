package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        Type figure = Type.values()[RANDOM.nextInt(Type.values().length)];
        switch (figure) {
            case SQUARE: {
                Square square = new Square(RANDOM.nextInt(101),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
                return square;
            }
            case ISOSCELESTRAPEZOID: {
                return new IsoscelesTrapezoid(RANDOM.nextInt(101),
                        RANDOM.nextInt(101), RANDOM.nextInt(101),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
            }
            case CIRCLE: {
                return new Circle(RANDOM.nextInt(101),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
            }
            case RESTANGLE: {
                return new Rectangle(RANDOM.nextInt(101),RANDOM.nextInt(101),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
            }
            case RIGHTTRIANGLE: {
                return new RightTriangle(RANDOM.nextInt(101),
                        RANDOM.nextInt(101),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
            }
            default: {
                return new RightTriangle(RANDOM.nextInt(101),
                        RANDOM.nextInt(101),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10, "white");
        return circle;
    }
}
