package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANDOM_NUMBER_BOUND = 99;
    private static final int RANDOM_INDEX = 5;
    private static final double DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    private Figure getSquare() {
        Figure square = new Square(random.nextInt(RANDOM_NUMBER_BOUND),
                colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRightTriangle() {
        Figure rightTriangle = new RightTriangle(random.nextInt(RANDOM_NUMBER_BOUND),
                random.nextInt(RANDOM_NUMBER_BOUND), colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRectangle() {
        Figure rectangle = new Rectangle(random.nextInt(RANDOM_NUMBER_BOUND),
                random.nextInt(RANDOM_NUMBER_BOUND), colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getCircle() {
        Figure circle = new Circle(random.nextInt(RANDOM_NUMBER_BOUND),
                colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(RANDOM_NUMBER_BOUND),
                random.nextInt(RANDOM_NUMBER_BOUND), random.nextInt(RANDOM_NUMBER_BOUND),
                colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(RANDOM_INDEX);
        switch (randomIndex) {
            case 1: return getSquare();
            case 2: return getRightTriangle();
            case 3: return getRectangle();
            case 4: return getCircle();
            default: return getIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle(DEFAULT_RADIUS, "White");
        return defaultCircle;
    }
}
