package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_SIZE = 10;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 30;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    public Figure getRandomFigure() {
        switch (getRandomShape()) {
            case CIRCLE: return getCircle();
            case RECTANGLE: return getRectangle();
            case ISOSCELES_TRAPEZOID: return getIsoscelesTrapezoid();
            case RIGHT_TRIANGLE: return getRightTriangle();
            case SQUARE: return getSquare();
            default: return getDefaultFigure();
        }
    }

    private Shape getRandomShape() {
        return Shape.values()[random.nextInt(Shape.values().length)];
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE) + MIN_SIZE);
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE) + MIN_SIZE,
                random.nextInt(MAX_SIZE) + MIN_SIZE,
                random.nextInt(MAX_SIZE) + MIN_SIZE);
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE) + MIN_SIZE,
                random.nextInt(MAX_SIZE) + MIN_SIZE);
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE) + MIN_SIZE);
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                random.nextInt(MAX_SIZE) + MIN_SIZE,
                random.nextInt(MAX_SIZE) + MIN_SIZE,
                random.nextInt(MAX_SIZE) + MIN_SIZE);
    }
}
