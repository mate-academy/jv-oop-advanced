package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RADIUS_CIRCLE = 10;
    private static final int RANDOM_NUMBER = 100;
    private static final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(GeometricFigure.values().length);
        GeometricFigure figure = GeometricFigure.values()[index];

        switch (figure) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), getRandomSideLength());
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), getRandomSideLength(),
                        getRandomSideLength());
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), getRandomSideLength(),
                        getRandomSideLength());
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), getRandomRadius());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomSideLength(),
                        getRandomSideLength(), getRandomHeight());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), RADIUS_CIRCLE);
    }

    private double getRandomSideLength() {
        return random.nextDouble(RANDOM_NUMBER);
    }

    private double getRandomRadius() {
        return random.nextDouble(RANDOM_NUMBER);
    }

    private double getRandomHeight() {
        return random.nextDouble(RANDOM_NUMBER);
    }
}

