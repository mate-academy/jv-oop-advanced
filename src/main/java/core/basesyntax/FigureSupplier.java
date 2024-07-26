package core.basesyntax;

import figures.Circle;
import figures.Color;
import figures.Figure;
import figures.IsoscelesTrapezoid;
import figures.Rectangle;
import figures.RightTriangle;
import figures.Square;
import java.util.Random;

public class FigureSupplier {
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPES = 5;
    private static final double DIMENSION_RANGE = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return createSquare(color);
            case 1:
                return createRectangle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createCircle(color);
            default:
                return createIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure createSquare(String color) {
        double side = getRandomDimension();
        return new Square(color, side);
    }

    private Figure createRectangle(String color) {
        double length = getRandomDimension();
        double width = getRandomDimension();
        return new Rectangle(color, length, width);
    }

    private Figure createRightTriangle(String color) {
        double firstLeg = getRandomDimension();
        double secondLeg = getRandomDimension();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createCircle(String color) {
        double radius = getRandomDimension();
        return new Circle(color, radius);
    }

    private Figure createIsoscelesTrapezoid(String color) {
        double base1 = getRandomDimension();
        double base2 = getRandomDimension();
        double height = getRandomDimension();
        return new IsoscelesTrapezoid(color, base1, base2, height);
    }

    private double getRandomDimension() {
        return random.nextDouble() * DIMENSION_RANGE + 1;
    }
}
