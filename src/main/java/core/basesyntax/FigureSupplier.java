package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final double DEFAULT_RADIUS = 10.0;
    private static final int FIGURE_COUNT = 5;
    private static final double MIN_RANDOM_VALUE = 1.0;
    private static final double MAX_RANDOM_VALUE = 10.0;
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(getRandomValue(), ColorSupplier.getInstance().getRandomColor());
            case 1:
                return new Rectangle(getRandomValue(), getRandomValue(),
                        ColorSupplier.getInstance().getRandomColor());
            case 2:
                return new RightTriangle(getRandomValue(), getRandomValue(),
                        ColorSupplier.getInstance().getRandomColor());
            case 3:
                return new Circle(getRandomValue(), ColorSupplier.getInstance().getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(), getRandomValue(),
                        ColorSupplier.getInstance().getRandomColor());
            default:
                return null;
        }
    }

    private double getRandomValue() {
        return random.nextDouble() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE) + MIN_RANDOM_VALUE;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "white");
    }
}

