package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN_VALUE = 1.0;
    private static final double MAX_VALUE = 50.0;
    private static final double AVERAGE_VALUE = 25.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        Figures figures = Figures.values()[random.nextInt(Figures.values().length)];
        switch (figures) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_VALUE, MAX_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_VALUE, MAX_VALUE),
                        random.nextDouble(MIN_VALUE, MAX_VALUE),
                        random.nextDouble(MIN_VALUE, AVERAGE_VALUE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_VALUE, MAX_VALUE),
                        random.nextDouble(MIN_VALUE, MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_VALUE, MAX_VALUE),
                        random.nextDouble(MIN_VALUE, MAX_VALUE));
            default:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble(MIN_VALUE, MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }
}
