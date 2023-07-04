package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_NUMBER_BOUND = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int length = Shape.values().length;
        int index = random.nextInt(length);
        switch (Shape.values()[index]) {
            case CIRCLE: {
                return getCircle();
            }
            case SQUARE: {
                return getSquare();
            }
            case RIGHT_TRIANGLE: {
                return getRightTriangle();
            }
            case RECTANGLE: {
                return getRectangle();
            }
            default: {
                return getIsoscelesTrapezoid();
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomNumber(),
                getRandomNumber(), getRandomNumber());
    }

    private int getRandomNumber() {
        return random.nextInt(RANDOM_NUMBER_BOUND);
    }
}
