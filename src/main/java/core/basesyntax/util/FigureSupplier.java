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
                double radius = random.nextDouble() * random.nextInt();
                figure = new Circle(radius, color);
                break;
            case SQUARE:
                double side = random.nextDouble() * random.nextInt();
                figure = new Square(side, color);
                break;
            case RECTANGLE:
                double width = random.nextDouble() * random.nextInt();
                double height = random.nextDouble() * random.nextInt();
                figure = new Rectangle(width, height, color);
                break;
            case RIGHT_TRIANGLE:
                double firstLeg = random.nextDouble() * random.nextInt();
                double secondLeg = random.nextDouble() * random.nextInt();
                figure = new RightTriangle(firstLeg, secondLeg, color);
                break;
            case ISOSCELES_TRAPEZOID:
                double base = random.nextDouble() * random.nextInt();
                double top = random.nextDouble() * random.nextInt();
                double leg = random.nextDouble() * random.nextInt();
                figure = new IsoscelesTrapezoid(base, top, leg, color);
                break;
            default:
                figure = getDefaultFigure();
        }

        return figure;
    }

}
