package core.basesyntax.util;

import static core.basesyntax.entity.Shape.values;

import core.basesyntax.entity.Circle;
import core.basesyntax.entity.Color;
import core.basesyntax.entity.Figure;
import core.basesyntax.entity.IsoscelesTrapezoid;
import core.basesyntax.entity.Rectangle;
import core.basesyntax.entity.RightTriangle;
import core.basesyntax.entity.Shape;
import core.basesyntax.entity.Square;
import java.util.Random;

public class FigureSupplier {
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getDefaultFigure() {
        return new Circle(10, colorSupplier.getDefaultColor());
    }

    public Figure getRandomFigure() {
        Shape shape = values()[random.nextInt(values().length)];
        Color color = colorSupplier.getRandomColor();

        Figure figure;

        switch (shape) {
            case CIRCLE:
                figure = getRandomCircle(color);
                break;
            case SQUARE:
                figure = getRandomSquare(color);
                break;
            case RECTANGLE:
                figure = getRandomRectangle(color);
                break;
            case RIGHT_TRIANGLE:
                figure = getRandomRightTriangle(color);
                break;
            case ISOSCELES_TRAPEZOID:
                figure = getRandomIsoscelesTrapezoid(color);
                break;
            default:
                figure = getDefaultFigure();
        }

        return figure;
    }

    private Figure getRandomIsoscelesTrapezoid(Color color) {
        double base = getRandomLength();
        double top = getRandomLength();
        double leg = getRandomLength();
        return new IsoscelesTrapezoid(base, top, leg, color);
    }

    private Figure getRandomRightTriangle(Color color) {
        double firstLeg = getRandomLength();
        double secondLeg = getRandomLength();
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure getRandomRectangle(Color color) {
        double width = getRandomLength();
        double height = getRandomLength();
        return new Rectangle(width, height, color);
    }

    private Figure getRandomSquare(Color color) {
        double side = getRandomLength();
        return new Square(side, color);
    }

    private Figure getRandomCircle(Color color) {
        double radius = getRandomLength();
        return new Circle(radius, color);
    }

    private double getRandomLength() {
        return Math.abs(random.nextDouble() * random.nextInt());
    }

}
