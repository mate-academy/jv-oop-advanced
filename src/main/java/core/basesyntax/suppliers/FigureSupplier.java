package core.basesyntax.suppliers;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.Shape;
import core.basesyntax.figures.impl.Circle;
import core.basesyntax.figures.impl.Figure;
import core.basesyntax.figures.impl.IsoscelesTrapezoid;
import core.basesyntax.figures.impl.Rectangle;
import core.basesyntax.figures.impl.RightTriangle;
import core.basesyntax.figures.impl.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 10;
    private static final int DEFAULT_LENGTH = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MIN_LENGTH = 1;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_LENGTH);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(Shape.values().length);
        Shape figure = Shape.values()[index];
        switch (figure) {
            case SQUARE:
                return getRandomSquare();
            case RECTANGLE:
                return getRandomRectangle();
            case RIGHT_RECTANGLE:
                return getRandomRightRectangle();
            case ISOSCELES_TRAPEZOID:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomCircle();
        }
    }

    private Figure getRandomSquare() {
        Color color = colorSupplier.getRandomColor();
        double side = getLengthSide();
        return new Square(color, side);
    }

    private Figure getRandomRectangle() {
        Color color = colorSupplier.getRandomColor();
        double height = getLengthSide();
        double width = getLengthSide();
        return new Rectangle(color, width, height);
    }

    private Figure getRandomRightRectangle() {
        Color color = colorSupplier.getRandomColor();
        double firstLeg = getLengthSide();
        double secondLeg = getLengthSide();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Color color = colorSupplier.getRandomColor();
        double lowerBase = getLengthSide();
        double upperBase = getLengthSide();
        double side = getLengthSide();
        return new IsoscelesTrapezoid(color, lowerBase, upperBase, side);
    }

    private Figure getRandomCircle() {
        Color color = colorSupplier.getRandomColor();
        double radius = getLengthSide();
        return new Circle(color, radius);
    }

    private double getLengthSide() {
        return random.nextInt(BOUND) + MIN_LENGTH;
    }
}
