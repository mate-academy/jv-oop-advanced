package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RADIUS = 10;
    private static final int MAX_WIDTH = 8;
    private static final int MAX_HEIGHT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    enum FigureType {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }

    public Figure getRandomFigure() {
        FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
        String color = colorSupplier.getRandomColor();
        double first = random.nextDouble(MAX_RADIUS) + 1;
        double second = random.nextDouble(MAX_WIDTH) + 1;
        double third = random.nextDouble(MAX_HEIGHT) + 1;

        return switch (type) {
            case CIRCLE -> new Circle(color, first);
            case SQUARE -> new Square(color, first);
            case RECTANGLE -> new Rectangle(color, first, second);
            case RIGHT_TRIANGLE -> new RightTriangle(color, first, second);
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color, first, second, third);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", MAX_RADIUS);
    }
}


