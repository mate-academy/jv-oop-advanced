package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int ORIGIN = 1;
    private static final int BOUND = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(Shape.values().length);
        Shape shape = Shape.values()[index];
        return switch (shape) {
            case CIRCLE -> new Circle(getRandomInt(), colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(getRandomInt(), getRandomInt(),
                    getRandomInt(),colorSupplier.getRandomColor());
            case SQUARE -> new Square(getRandomInt(), colorSupplier.getRandomColor());
            case RECTANGLE -> new Rectangle(getRandomInt(), getRandomInt(),
                    colorSupplier.getRandomColor());
            default -> new RightTriangle(getRandomInt(),
                    getRandomInt(), colorSupplier.getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomInt() {
        return random.nextInt(ORIGIN, BOUND);
    }
}
