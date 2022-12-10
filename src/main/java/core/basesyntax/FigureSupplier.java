package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final Color DEFAULT_CIRCLE_COLOR = Color.WHITE;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public int getValue() {
        return random.nextInt(MAX_VALUE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureList.values().length);
        for (int i = 0; i < FigureList.values().length; i++) {
            switch (FigureList.values()[index]) {
                case CIRCLE:
                    return new Circle(colorSupplier.getRandomColor(), getValue());
                case SQUARE:
                    return new Square(colorSupplier.getRandomColor(), getValue());
                case TRIANGLE:
                    return new RightTriangle(colorSupplier.getRandomColor(),
                            getValue(), getValue());
                case RECTANGLE:
                    return new Rectangle(colorSupplier.getRandomColor(), getValue(), getValue());
                default:
                    break;
            }
        }
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getValue(), getValue(), getValue());
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR.name(), DEFAULT_CIRCLE_RADIUS);
    }
}
