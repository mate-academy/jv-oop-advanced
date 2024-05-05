package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double MAX_CIRCLE_RADIUS = 10;
    private static final int RANDOM_INDEX = 5;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(RANDOM_INDEX);
        String color = colorSupplier.getRandomColor();
        return switch (index) {
            case 0 -> createRandomSquare(color);
            case 1 -> createRandomRectangle(color);
            case 2 -> createRandomRightTriangle(color);
            case 3 -> createRandomCircle(color);
            default -> createRandomIsoscelesTrapezoid(color);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, MAX_CIRCLE_RADIUS);
    }

    private Square createRandomSquare(String color) {
        return new Square(color, random.nextDouble());
    }

    private Rectangle createRandomRectangle(String color) {
        return new Rectangle(color, random.nextDouble(), random.nextDouble());
    }

    private RightTriangle createRandomRightTriangle(String color) {
        return new RightTriangle(color, random.nextDouble());
    }

    private Circle createRandomCircle(String color) {
        return new Circle(color, random.nextDouble());
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(
                color, random.nextDouble(), random.nextDouble(), random.nextDouble());
    }
}
