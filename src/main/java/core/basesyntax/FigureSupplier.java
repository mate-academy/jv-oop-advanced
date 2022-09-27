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
                double side = random.nextDouble() * MAX_PARAMETER;
                return new Square(color, side);
            case RECTANGLE:
                double width = random.nextDouble() * MAX_PARAMETER;
                double height = random.nextDouble() * MAX_PARAMETER;
                return new Rectangle(color, width, height);
            case RIGHT_TRIANGLE:
                double base = random.nextDouble() * MAX_PARAMETER;
                height = random.nextDouble() * MAX_PARAMETER;
                return new RightTriangle(color, base, height);
            case CIRCLE:
                double radius = random.nextDouble() * MAX_PARAMETER;
                return new Circle(color, radius);
            case ISOSCELES_TRAPEZOID:
                double top = random.nextDouble() * MAX_PARAMETER;
                double bottom = random.nextDouble() * MAX_PARAMETER;
                height = random.nextDouble() * MAX_PARAMETER;
                return new IsoscelesTrapezoid(color, top, bottom, height);
            default:
                throw new IllegalStateException(
                        "Unexpected value: " + Figures.values()[figureIndex]
                );
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
