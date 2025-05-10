package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_SIZE = 10;
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final Random RANDOM = new Random();
    private static final int MAX_SIDE_LENGTH = 10;
    private static final int MAX_VALUE = 5;

    public Figure getRandomFigure() {
        int figureType = RANDOM.nextInt(MAX_VALUE);
        String randomColor = COLOR_SUPPLIER.getRandomColor();
        double randomSide = getRandomSide();

        switch (figureType) {
            case 0:
                return createSquare(randomColor, randomSide);
            case 1:
                return createRectangle(randomColor, randomSide);
            case 2:
                return createRightTriangle(randomColor, randomSide);
            case 3:
                return createCircle(randomColor, randomSide);
            case 4:
                return createIsoscelesTrapezoid(randomColor, randomSide);
            default:
                return getDefaultFigure();
        }
    }

    private double getRandomSide() {
        return RANDOM.nextDouble() * MAX_SIDE_LENGTH;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
    }

    private Square createSquare(String color, double side) {
        return new Square(color.toLowerCase(), side);
    }

    private Rectangle createRectangle(String color, double side) {
        return new Rectangle(color, side, side);
    }

    private RightTriangle createRightTriangle(String color, double side) {
        return new RightTriangle(color, side, side);
    }

    private Circle createCircle(String color, double radius) {
        return new Circle(color, radius);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color, double side) {
        return new IsoscelesTrapezoid(color, side, side, side);
    }
}
