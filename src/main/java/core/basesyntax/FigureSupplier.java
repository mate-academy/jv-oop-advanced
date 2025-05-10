package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN = 3.0;
    private static final double MAX = 100.0;
    private static final String DEFAULT_COLOR = Color.WHITE.toString().toLowerCase();
    private static final double DEFAULT_VALUE = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureList.values().length);
        FigureList figureCase = FigureList.values()[index];

        switch (figureCase) {
            case CIRCLE:
                return new Circle(
                        colorSupplier.getRandomColor(),
                        getRandomNumberInRange(MIN, MAX));

            case ISOSCElES_TRAPEZOID:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        getRandomNumberInRange(MIN, MAX),
                        getRandomNumberInRange(MIN, MAX),
                        getRandomNumberInRange(MIN, MAX));

            case RECTANGLE:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        getRandomNumberInRange(MIN, MAX),
                        getRandomNumberInRange(MIN, MAX));

            case RIGHT_TRIANGLE:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        getRandomNumberInRange(MIN, MAX));

            case SQUARE:
                return new Square(
                        colorSupplier.getRandomColor(),
                        getRandomNumberInRange(MIN, MAX));

            default:
                getDefaultFigure();
        }

        return null;
    }

    private double getRandomNumberInRange(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}
