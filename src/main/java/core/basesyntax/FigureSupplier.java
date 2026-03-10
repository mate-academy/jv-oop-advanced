package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double valueMin = 1.0;
    private static final double valueMax = 10.0;
    private static final Figures DEFAULT_CIRCLE = new Circle(10, "white");
    private final ListFigures[] figures = ListFigures.values();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figures getDefaultFigure() {
        return DEFAULT_CIRCLE;
    }

    public Figures getRandomFigure() {
        double value1 = valueMinMax();
        double value2 = valueMinMax();
        double value3 = valueMinMax();
        String color1 = colorSupplier.getRandomColor();

        switch (figures[random.nextInt(figures.length)]) {
            case CIRCLE:
                return new Circle(value1, color1);
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(value1, value2, value3, color1);
            case RIGHT_TRIANGLE:
                return new RightTriangle(value1, value2, color1);
            case RECTANGLE:
                return new Rectangle(value1, value2, color1);
            case SQUARE:
                return new Square(value1, color1);
            default:
                return getDefaultFigure();
        }
    }

    public double valueMinMax() {
        return valueMax + random.nextDouble() * (valueMax - valueMin);
    }
}
