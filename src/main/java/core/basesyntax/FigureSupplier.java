package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MIN_SHAPE_VALUE = 5;
    private static final int MAX_SHAPE_VALUE = 15;
    private static final Figure DEFAULT_FIGURE = new Circle("white", 10);
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        String figureName = Figures.values()[random.nextInt(Figures.values().length)].name();
        switch (figureName) {
            case "CIRCLE":
                return getCircle(color);
            case "ISOSCELES_TRAPEZOID":
                return getIsoscelesTrapezoid(color);
            case "RECTANGLE":
                return getRectangle(color);
            case "RIGHT_TRIANGLE":
                return getRightTriangle(color);
            default:
                return getSquare(color);
        }
    }

    private int getShapeArgument() {
        return random.nextInt(MAX_SHAPE_VALUE + 1) + MIN_SHAPE_VALUE;
    }

    private Figure getCircle(String color) {
        return new Circle(color, getShapeArgument());
    }

    private Figure getIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color,
                getShapeArgument(),
                getShapeArgument(),
                getShapeArgument());
    }

    private Figure getRectangle(String color) {
        return new Rectangle(color,
                getShapeArgument(),
                getShapeArgument());
    }

    private Figure getRightTriangle(String color) {
        return new RightTriangle(color,
                getShapeArgument(),
                getShapeArgument());
    }

    private Figure getSquare(String color) {
        return new Square(color,
                getShapeArgument());
    }
}
