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

    public Figure getRandomFigure() {
        Figure square = new Square(random.nextInt(RANDOM_NUMBER_BOUND),
                        colorSupplier.getRandomColor());
        Figure rightTriangle = new RightTriangle(random.nextInt(RANDOM_NUMBER_BOUND),
                        random.nextInt(RANDOM_NUMBER_BOUND), colorSupplier.getRandomColor());
        Figure rectangle = new Rectangle(random.nextInt(RANDOM_NUMBER_BOUND),
                        random.nextInt(RANDOM_NUMBER_BOUND), colorSupplier.getRandomColor());
        Figure circle = new Circle(random.nextInt(RANDOM_NUMBER_BOUND),
                        colorSupplier.getRandomColor());
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(RANDOM_NUMBER_BOUND),
                        random.nextInt(RANDOM_NUMBER_BOUND), random.nextInt(RANDOM_NUMBER_BOUND),
                        colorSupplier.getRandomColor());
        int randomIndex = random.nextInt(RANDOM_INDEX);
        switch (randomIndex) {
            case 1: return square;
            case 2: return rightTriangle;
            case 3: return rectangle;
            case 4: return circle;
            default: return isoscelesTrapezoid;
        }
    }

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle(DEFAULT_RADIUS, "White");
        return defaultCircle;
    }
}
