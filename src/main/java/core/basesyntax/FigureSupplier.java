package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int randomValue = 100;
    private static final String defaultColor = "WHITE";
    private static final int defaultRadius = 10;
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
        return new Circle(defaultColor,defaultRadius);
    }

    private int getRandomNumber() {
        return random.nextInt(randomValue);
    }

    public Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),getRandomNumber());
    }

    public Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),getRandomNumber(),getRandomNumber());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),getRandomNumber(),
                getRandomNumber(),getRandomNumber());
    }

    public Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),getRandomNumber(),
                getRandomNumber());
    }

    public Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),getRandomNumber());
    }

}
