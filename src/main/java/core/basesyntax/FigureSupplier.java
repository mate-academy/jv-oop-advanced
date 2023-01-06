package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_SIZE = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_LENGHT = 30;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    public Figure getRandomFigure() {
        switch (getRandomShape()) {
            case CIRCLE:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGHT - 1) + 1);
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGHT - 1) + 1,
                        random.nextInt(MAX_LENGHT - 1) + 1);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGHT - 1) + 1,
                        random.nextInt(MAX_LENGHT - 1) + 1,
                        random.nextInt(MAX_LENGHT - 1) + 1);
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGHT - 1) + 1,
                        random.nextInt(MAX_LENGHT - 1) + 1,
                        random.nextInt(MAX_LENGHT - 1) + 1);
            case SQUARE:
                return new Square(
                        colorSupplier.getRandomColor(),
                        random.nextInt(MAX_LENGHT - 1) + 1);
            default:
                return getDefaultFigure();
        }
    }

    private Shape getRandomShape() {
        return Shape.values()[random.nextInt(Shape.values().length)];
    }
}
