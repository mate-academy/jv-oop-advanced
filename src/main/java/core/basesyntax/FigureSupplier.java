package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double RADIUS = 10;
    private static final int MAX_RANDOM_NUMBER = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Shape shape = Shape.values()[random.nextInt(Shape.values().length)];

        switch (shape) {
            case CIRCLE:
                return getCircle();
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case TRIANGLE:
                return getRightTriangle();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(RADIUS, Color.WHITE.name());
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER) + 1;
    }

    private Circle getCircle() {
        return new Circle(getRandomNumber(), colorSupplier.getRandomColor());
    }

    private Square getSquare() {
        return new Square(getRandomNumber(), colorSupplier.getRandomColor());
    }

    private Rectangle getRectangle() {
        return new Rectangle(getRandomNumber(), getRandomNumber(),
                colorSupplier.getRandomColor());
    }

    private RightTriangle getRightTriangle() {
        return new RightTriangle(getRandomNumber(), getRandomNumber(),
                colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(), getRandomNumber(),
                colorSupplier.getRandomColor());
    }
}
