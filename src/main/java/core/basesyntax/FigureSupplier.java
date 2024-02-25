package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MIN_RANDOM_VALUE = 1.0;
    private static final double MAX_RANDOM_VALUE = 10.0;
    private Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(getRandomValue(), getRandomColor());
            case 1:
                return new Rectangle(getRandomValue(), getRandomValue(), getRandomColor());
            case 2:
                return new RightTriangle(getRandomValue(), getRandomValue(), getRandomColor());
            case 3:
                return new Circle(getRandomValue(), getRandomColor());
            case 4:
                return new IsoscelesTrapezoid(getRandomValue(), getRandomValue(), getRandomValue(),
                        getRandomColor());
            default:
                return null;
        }
    }

    private double getRandomValue() {
        return random.nextDouble() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE) + MIN_RANDOM_VALUE;
    }

    private String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }

    public Figure getDefaultFigure() {
        return new Circle(10.0, "white");
    }
}
