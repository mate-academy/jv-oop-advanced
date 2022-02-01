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
                double radius = getRandomLength();
                figure = new Circle(radius, color);
                break;
            case SQUARE:
                double side = getRandomLength();
                figure = new Square(side, color);
                break;
            case RECTANGLE:
                double width = getRandomLength();
                double height = getRandomLength();
                figure = new Rectangle(width, height, color);
                break;
            case RIGHT_TRIANGLE:
                double firstLeg = getRandomLength();
                double secondLeg = getRandomLength();
                figure = new RightTriangle(firstLeg, secondLeg, color);
                break;
            case ISOSCELES_TRAPEZOID:
                double base = getRandomLength();
                double top = getRandomLength();
                double leg = getRandomLength();
                figure = new IsoscelesTrapezoid(base, top, leg, color);
                break;
            default:
                figure = getDefaultFigure();
        }

        return figure;
    }

    private double getRandomLength() {
        return Math.abs(random.nextDouble() * random.nextInt());
    }

}
