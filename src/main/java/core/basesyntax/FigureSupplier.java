package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(6);
        String color = colorSupplier.getRandomColor();
        switch (index) {
            case 0:
                return createRandomSquare(color);
            case 1:
                return createRandomRectangle(color);
            case 2:
                return createRandomTriangle(color);
            case 3:
                return createRandomCircle(color);
            case 4:
                return createRandomTrapezoid(color);
            default:
                return getDefaultFigure();
        }
    }

    public Square createRandomSquare(String color) {
        return new Square(color, getRandomNumber(1, 15));
    }

    public RightTriangle createRandomTriangle(String color) {
        return new RightTriangle(
        color, getRandomNumber(1, 15), getRandomNumber(2, 14), getRandomNumber(2, 16));
    }

    public Rectangle createRandomRectangle(String color) {
        return new Rectangle(color, getRandomNumber(1, 15), getRandomNumber(2, 16));
    }

    public IsoscelesTrapezoid createRandomTrapezoid(String color) {
        return new IsoscelesTrapezoid(
        color, getRandomNumber(1, 15), getRandomNumber(2, 16), getRandomNumber(2, 16));
    }

    public Circle createRandomCircle(String color) {
        return new Circle(color, getRandomNumber(1, 15));
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }

    private int getRandomNumber(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
