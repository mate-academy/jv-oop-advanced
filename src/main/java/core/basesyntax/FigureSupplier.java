package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_RANGE_MAX = 10;
    private static final int RANDOM_RANGE_MIN = 1;

    private static final String DEFAULT_COLOR = "WHITE";
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomCircle() {
        int radius = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        return new Circle(colorSupplier.getRandomColor(), radius);
    }

    private Figure getRandomIsoscelesTrapezoid() {
        int sideA = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        int sideB = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        int height = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                sideA, sideB, height);
    }

    private Figure getRandomRectangle() {
        int sideA = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        int sideB = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        return new Rectangle(colorSupplier.getRandomColor(), sideA, sideB);
    }

    private Figure getRandomRightTriangle() {
        int firstLeg = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        int secondLeg = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
    }

    private Figure getRandomSquare() {
        int side = random.nextInt(
                (RANDOM_RANGE_MAX - RANDOM_RANGE_MIN) + 1) + RANDOM_RANGE_MIN;
        return new Square(colorSupplier.getRandomColor(), side);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
