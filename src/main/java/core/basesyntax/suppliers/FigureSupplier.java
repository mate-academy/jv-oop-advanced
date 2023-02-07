package core.basesyntax.suppliers;

import core.basesyntax.base.Figure;
import core.basesyntax.figures.Circle;
import core.basesyntax.figures.IsoscelesTrapezoid;
import core.basesyntax.figures.Rectangle;
import core.basesyntax.figures.RightTriangle;
import core.basesyntax.figures.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MAX_PROPERTY_VALUE = 50;
    private static final String DEFAULT_CIRCLE_COLOR = "white";
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();
    private final FigureType[] figureTypes = FigureType.values();
    private final int figureCount = figureTypes.length;

    public Figure getRandomFigure() {
        int index = random.nextInt(figureCount);
        FigureType type = figureTypes[index];
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case CIRCLE:
                return getRandomCircle(color);
            case RECTANGLE:
                return getRandomRectangle(color);
            case SQUARE:
                return getRandomSquare(color);
            case RIGHT_TRIANGLE:
                return getRandomRightTriangle(color);
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid(color);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private double getRandomProperty() {
        return (int) (Math.random() * MAX_PROPERTY_VALUE);
    }
    
    private Figure getRandomCircle(String color) {
        double radius = getRandomProperty();
        return new Circle(color, radius);
    }

    private Figure getRandomRectangle(String color) {
        double firstSide = getRandomProperty();
        double secondSide = getRandomProperty();
        return new Rectangle(color, firstSide, secondSide);
    }

    private Figure getRandomSquare(String color) {
        double side = getRandomProperty();
        return new Square(color, side);
    }

    private Figure getRandomRightTriangle(String color) {
        double firstLeg = getRandomProperty();
        double secondLeg = getRandomProperty();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomIsoscelesTrapezoid(String color) {
        double topBase = getRandomProperty();
        double bottomBase = getRandomProperty();
        double height = getRandomProperty();
        return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
    }
}
