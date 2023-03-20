package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int MAX_RANDOM_VALUE = 100;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(AMOUNT_OF_FIGURES)) {
            case 0:
                return new Rectangle("Rectangle", color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 1:
                return new Circle("Circle", color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 2:
                return new IsoscelesTrapezoid("Isosceles Trapezoid",
                        color, random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
            case 3:
                return new Square("Square", color, random.nextInt(MAX_RANDOM_VALUE) + 1);
            default:
                return new RightTriangle("Right Triangle", color,
                        random.nextInt(MAX_RANDOM_VALUE) + 1,
                        random.nextInt(MAX_RANDOM_VALUE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", Color.WHITE.name(), CIRCLE_DEFAULT_RADIUS);
    }
}
