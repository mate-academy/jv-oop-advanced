package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private static final Random random = new Random();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_NUMBER = 20;
    private static final Color DEFAULT_COLOR = Color.WHITE;

    public Figure getRandomFigure() {
        switch (FigureName.values()[random.nextInt(FigureName.values().length)]) {
            case CIRCLE:
                return getCircle();
            case SQUARE:
                return getSquare();
            case RECTANGLE:
                return getRectangle();
            case RIGHT_TRIANGLE:
                return getRightTriangle();
            case ISOSCELES_TRAPECOID:
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
    }

    private Figure getIsoscelesTrapezoid() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }
}
