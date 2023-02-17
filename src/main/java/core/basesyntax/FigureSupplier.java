package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_VALUE = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure generateFigure() {
        switch (FigureType.values()[random.nextInt(FigureType.values().length)]) {
            case CIRCLE:
                return getRandomCircle();
            case SQUARE:
                return getRandomSquare();
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            case RECTANGLE:
                return getRandomRectangle();
            default:
                throw new RuntimeException("Figure does not exist");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomNumber() {
        return random.nextInt(RANDOM_VALUE);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomNumber(), getRandomNumber());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber(), getRandomNumber());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber());
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
    }

}
