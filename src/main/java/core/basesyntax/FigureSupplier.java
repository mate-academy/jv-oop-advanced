package core.basesyntax;

import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = "WHITE";
    private static final int RANDOM_LIMIT_NUMBER = 100;
    private static final int DEFAULT_RADIUS_NUMBER = 10;

    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private enum FigureType {
        SQUARE,
        RECTANGLE,
        RIGHT_TRIANGLE,
        CIRCLE,
        ISOSCELES_TRAPEZOID
    }

    public Figure getRandomFigure() {
        String type = getRandomType();
        String color = colorSupplier.getRandomColor();

        if (type.equals(FigureType.SQUARE.name())) {
            return getSquare(color);
        } else if (type.equals(FigureType.RECTANGLE.name())) {
            return getRectangle(color);
        } else if (type.equals(FigureType.RIGHT_TRIANGLE.name())) {
            return getRightTriangle(color);
        } else if (type.equals(FigureType.CIRCLE.name())) {
            return getCircle(color);
        } else {
            return getIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS_NUMBER);
    }

    private String getRandomType() {
        int index = rand.nextInt(FigureType.values().length);

        return FigureType.values()[index].name();
    }

    private Figure getSquare(String color) {
        double side = rand.nextInt(RANDOM_LIMIT_NUMBER);

        return new Square(color, side);
    }

    private Figure getRectangle(String color) {
        double sideA = rand.nextInt(RANDOM_LIMIT_NUMBER);
        double sideB = rand.nextInt(RANDOM_LIMIT_NUMBER);

        return new Rectangle(color, sideA, sideB);
    }

    private Figure getRightTriangle(String color) {
        double sideOne = rand.nextInt(RANDOM_LIMIT_NUMBER);
        double sideTwo = rand.nextInt(RANDOM_LIMIT_NUMBER);

        return new RightTriangle(color, sideOne, sideTwo);
    }

    private Figure getCircle(String color) {
        double radius = rand.nextInt(RANDOM_LIMIT_NUMBER);

        return new Circle(color, radius);
    }

    private Figure getIsoscelesTrapezoid(String color) {
        double topSide = rand.nextInt(RANDOM_LIMIT_NUMBER);
        double bottomSide = rand.nextInt(RANDOM_LIMIT_NUMBER);
        double height = rand.nextInt(RANDOM_LIMIT_NUMBER);

        return new IsoscelesTrapezoid(color, topSide, bottomSide, height);
    }

}
