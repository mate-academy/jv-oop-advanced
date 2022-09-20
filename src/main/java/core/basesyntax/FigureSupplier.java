package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MAX_PARAMETER = 30d;
    private static final double DEFAULT_CIRCLE_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private enum Figures {
        SQUARE, RECTANGLE, RIGHT_TRIANGLE, CIRCLE, ISOSCELES_TRAPEZOID
    }

    public Figure getRandomFigure() {
        var figureIndex = random.nextInt(Figures.values().length);
        switch (Figures.values()[figureIndex]) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), random.nextDouble() * MAX_PARAMETER);
            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_PARAMETER, random.nextDouble() * MAX_PARAMETER
                );
            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_PARAMETER,
                        random.nextDouble() * MAX_PARAMETER
                );
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble() * MAX_PARAMETER);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        random.nextDouble() * MAX_PARAMETER, random.nextDouble() * MAX_PARAMETER,
                        random.nextDouble() * MAX_PARAMETER
                );
            default:
                throw new IllegalStateException("Unexpected value: " + Figures.values()[figureIndex]);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", DEFAULT_CIRCLE_RADIUS);
    }
}
