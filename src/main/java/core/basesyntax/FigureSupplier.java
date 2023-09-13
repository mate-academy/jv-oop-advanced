package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure() {
        Type figures = Type.values()[new Random().nextInt(Type.values().length)];
        switch (figures) {
            case SQUARE: {
                Square square = new Square(RANDOM.nextInt(100),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
                return square;
            }
            case ISOSCELESTRAPEZOID: {
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(RANDOM.nextInt(100),
                        RANDOM.nextInt(100), RANDOM.nextInt(100),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
                return isoscelesTrapezoid;
            }
            case CIRCLE: {
                Circle circle = new Circle(RANDOM.nextInt(100),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
                return circle;
            }
            case RESTANGLE: {
                Rectangle rectangle = new Rectangle(RANDOM.nextInt(100),RANDOM.nextInt(100),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
                return rectangle;
            }
            case RIGHTTRIANGLE: {
                RightTriangle rightTriangle = new RightTriangle(RANDOM.nextInt(100),
                        RANDOM.nextInt(100),
                        COLOR_SUPPLIER.getRandomColor().toString().toLowerCase());
                return rightTriangle;
            }
            default: {
                return null;
            }
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10, "white");
        return circle;
    }
}
