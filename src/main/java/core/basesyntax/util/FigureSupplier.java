package core.basesyntax.util;

import core.basesyntax.entity.*;

import java.util.Random;

import static core.basesyntax.entity.Shape.*;

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
