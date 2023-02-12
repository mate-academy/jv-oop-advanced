package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE_VALUE = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Type type = Type.values()[random.nextInt(Type.values().length)];
        String color = colorSupplier.getRandomColor();
        switch (type) {
            case SQUARE:
                return new Square(color, randomInt());
            case RECTANGLE:
                return new Rectangle(color, randomInt(), randomInt());
            case TRIANGLE:
                return new RightTriangle(color, randomInt(), randomInt());
            case CIRCLE:
                return new Circle(color, randomInt());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(color, randomInt(), randomInt(), randomInt());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private int randomInt() {
        return random.nextInt(MAX_SIDE_VALUE);
    }
}
