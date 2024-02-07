package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM_NUMBER = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int UPPER_BOUND = 100;
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int index = RANDOM_NUMBER.nextInt(FigureType.values().length);
        return switch (FigureType.values()[index]) {
            case CIRCLE -> new Circle(RANDOM_NUMBER.nextInt(UPPER_BOUND),
                    COLOR_SUPPLIER.getRandomColor());
            case SQUARE -> new Square(RANDOM_NUMBER.nextInt(UPPER_BOUND),
                    COLOR_SUPPLIER.getRandomColor());
            case RECTANGLE -> new Rectangle(RANDOM_NUMBER.nextInt(UPPER_BOUND),
                    RANDOM_NUMBER.nextInt(UPPER_BOUND), COLOR_SUPPLIER.getRandomColor());
            case RIGHT_TRIANGLE -> new RightTriangle(RANDOM_NUMBER.nextInt(UPPER_BOUND),
                    RANDOM_NUMBER.nextInt(UPPER_BOUND), COLOR_SUPPLIER.getRandomColor());
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(RANDOM_NUMBER.nextInt(UPPER_BOUND),
                    RANDOM_NUMBER.nextInt(UPPER_BOUND), RANDOM_NUMBER.nextInt(UPPER_BOUND),
                    COLOR_SUPPLIER.getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
