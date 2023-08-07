package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_RANGE_MAX = 10;
    private static final int RANDOM_RANGE_MIN = 1;

    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0: {
                int radius = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                return new Circle(colorSupplier.getRandomColor(), radius);
            }
            case 1: {
                int sideA = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                int sideB = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                int height = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), sideA, sideB, height);
            }
            case 2: {
                int sideA = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                int sideB = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                return new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
            }
            case 3: {
                int firstLeg = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                int secondLeg = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            }
            case 4: {
                int side = random.nextInt((RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
                return new Square(colorSupplier.getRandomColor(), side);
            }
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
