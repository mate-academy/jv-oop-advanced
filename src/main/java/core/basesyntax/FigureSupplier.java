package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = FigureType.values().length;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final int DEFAULT_VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigureIndex = getRandomInt(FIGURE_COUNT);
        switch (FigureType.values()[randomFigureIndex]) {
            case SQUARE:
                return new Square(
                    colorSupplier.getRandomColor(),
                    getRandomDouble(MIN_VALUE, MAX_VALUE));
            case RECTANGLE:
                return new Rectangle(
                    colorSupplier.getRandomColor(),
                    getRandomDouble(MIN_VALUE, MAX_VALUE),
                    getRandomDouble(MIN_VALUE, MAX_VALUE));
            case TRIANGLE:
                return new RightTriangle(
                    colorSupplier.getRandomColor(),
                    getRandomDouble(MIN_VALUE, MAX_VALUE),
                    getRandomDouble(MIN_VALUE, MAX_VALUE));
            case CIRCLE:
                return new Circle(
                    colorSupplier.getRandomColor(),
                    getRandomDouble(MIN_VALUE, MAX_VALUE));
            case TRAPEZOID:
                return new IsoscelesTrapezoid(
                    colorSupplier.getRandomColor(),
                    getRandomDouble(MIN_VALUE, MAX_VALUE),
                    getRandomDouble(MIN_VALUE, MAX_VALUE),
                    getRandomDouble(MIN_VALUE, MAX_VALUE));
            default:
                System.out.println("Error, missing figure type");
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(
              Color.WHITE.name(),
              DEFAULT_VALUE);
    }

    private int getRandomInt(int upperBound) {
        return random.nextInt(upperBound);
    }

    private double getRandomDouble(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }
}
