package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final double DEFAULT_RADIUS = 10;
    private static final int MULTIPLIER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final FigureShape[] figureArr = FigureShape.values();

    public Figure getRandomFigure() {
        switch (figureArr[random.nextInt(figureArr.length)]) {
            case CIRCLE:
                return new Circle(getRandomDouble(MULTIPLIER),
                        colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(getRandomDouble(MULTIPLIER),
                        getRandomDouble(MULTIPLIER),
                        colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(getRandomDouble(MULTIPLIER),
                        colorSupplier.getRandomColor());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(getRandomDouble(MULTIPLIER),
                        getRandomDouble(MULTIPLIER),
                        getRandomDouble(MULTIPLIER),
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(getRandomDouble(MULTIPLIER),
                        getRandomDouble(MULTIPLIER),
                        colorSupplier.getRandomColor());
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name().toLowerCase());
    }

    public double getRandomDouble(double bound) {
        return bound * random.nextDouble();
    }
}
