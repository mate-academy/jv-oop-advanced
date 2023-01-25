package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 100;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();
    private FigureType figureType;

    public Figure generateFigure() {
        switch (figureType) {
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
                throw new RuntimeException("Figure is not exist");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomNumber() {
        return random.nextInt(BOUND);
    }

    private Figure getRandomCircle() {
        Figure circle = new Circle(colorSupplier.getRandomColor(), getRandomNumber());
        return circle;
    }

    private Figure getRandomSquare() {
        Figure square = new Square(colorSupplier.getRandomColor(), getRandomNumber());
        return square;
    }

    private Figure getRandomRightTriangle() {
        Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber(), getRandomNumber());
        return isoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                getRandomNumber(), getRandomNumber());
        return rectangle;
    }
}
