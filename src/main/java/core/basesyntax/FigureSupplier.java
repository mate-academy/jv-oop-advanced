package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_NUMBER = 20;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int randomFigureType = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[randomFigureType]) {
            case CIRCLE: return getRandomCircle();
            case SQUARE: return getRandomSquare();
            case RECTANGLE: return getRandomRectangle();
            case RIGHT_TRIANGLE: return getRandomRightTriangle();
            case ISOSCELES_TRAPEZOID: return getIsoscelesTrapezoid();
            default: return getDefaultFigure();
        }
    }

    private int getRandomNumber() {
        return random.nextInt(MAX_NUMBER);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomNumber());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomNumber(), getRandomNumber());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber());
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomNumber(),
                getRandomNumber(),
                getRandomNumber());
    }
}
