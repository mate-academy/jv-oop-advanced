package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final short MAX_SIDE_VALUE = 50;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Type type = Type.values()[random.nextInt(Type.values().length)];
        String color = colorSupplier.getRandomColor();
        switch (type) {
            case SQUARE:
                return new Square(color, getRandomShort());
            case RECTANGLE:
                return new Rectangle(color, getRandomShort(), getRandomShort());
            case TRIANGLE:
                return new RightTriangle(color, getRandomShort(), getRandomShort());
            case CIRCLE:
                return new Circle(color, getRandomShort());
            case TRAPEZOID:
                return new IsoscelesTrapezoid(color, getRandomShort(),
                                              getRandomShort(), getRandomShort());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    private int getRandomShort() {
        return random.nextInt(MAX_SIDE_VALUE);
    }
}
