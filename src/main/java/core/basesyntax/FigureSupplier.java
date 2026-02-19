package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final int NUMBER = 5;
    private static final int MAX_SIDE = 50;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        int num = RANDOM.nextInt(NUMBER);
        double side1 = RANDOM.nextInt(MAX_SIDE) + 1;
        double side2 = RANDOM.nextInt(MAX_SIDE) + 1;
        double side3 = RANDOM.nextInt(MAX_SIDE) + 1;
        ColorSupplier colorSupplier = new ColorSupplier();
        return switch (num) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), side1);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(), side1, side2);
            case 2 -> new RightTriangle(colorSupplier.getRandomColor(), side1, side2);
            case 3 -> new Square(colorSupplier.getRandomColor(), side1);
            case 4 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(), side1, side2, side3);
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }

    public AreaCalculator getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
