package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final double DEFAULT_RADIUS = 10.0;
    private static final int FIGURE_COUNT = 5;
    private static final double MIN_RANDOM_VALUE = 1.0;
    private static final double MAX_RANDOM_VALUE = 10.0;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(getRandomValue(), colorSupplier.getRandomColor());
            case 1:
                return new Rectangle(getRandomValue(), getRandomValue(),
                        colorSupplier.getRandomColor());
            case 2:
                return new RightTriangle(getRandomValue(), getRandomValue(),
                        colorSupplier.getRandomColor());
            case 3:
                return new Circle(getRandomValue(), colorSupplier.getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(),
                        getRandomValue(), colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    private double getRandomValue() {
        return random.nextDouble() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE) + MIN_RANDOM_VALUE;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "white".toLowerCase());
    }
}

