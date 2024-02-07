package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_PARAMETER = 30d;
    private static final double DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private enum Figures {
        SQUARE, RECTANGLE, RIGHT_TRIANGLE, CIRCLE, ISOSCELES_TRAPEZOID
    }

    public Figure getRandomFigure() {
        var figureIndex = random.nextInt(Figures.values().length);
        String color = colorSupplier.getRandomColor();
        switch (Figures.values()[figureIndex]) {
            case SQUARE:
                double side = getRandomParameter();
                return new Square(color, side);
            case RECTANGLE:
                double width = getRandomParameter();
                double height = getRandomParameter();
                return new Rectangle(color, width, height);
            case RIGHT_TRIANGLE:
                double base = getRandomParameter();
                height = getRandomParameter();
                return new RightTriangle(color, base, height);
            case CIRCLE:
                double radius = getRandomParameter();
                return new Circle(color, radius);
            case ISOSCELES_TRAPEZOID:
                double top = getRandomParameter();
                double bottom = getRandomParameter();
                height = getRandomParameter();
                return new IsoscelesTrapezoid(color, top, bottom, height);
            default:
                //Without default case 'missing return statement' compile error
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private double getRandomParameter() {
        return random.nextDouble() * MAX_PARAMETER;
    }
}
