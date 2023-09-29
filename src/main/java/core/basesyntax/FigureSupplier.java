package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_SIZE = 10;
    private static final double MIN_SIZE = 1;
    private static final double DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomChoice = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (randomChoice) {
            case 0:
                double squareSide = getRandomSize(random);
                return new Square(squareSide, color);
            case 1:
                double length = getRandomSize(random);
                double width = getRandomSize(random);
                return new Rectangle(length, width, color);
            case 2:
                double base = getRandomSize(random);
                double height = getRandomSize(random);
                return new RightTriangle(base, height, color);
            case 3:
                double radius = getRandomSize(random);
                return new Circle(radius, color);
            default:
                double topBase = getRandomSize(random);
                double bottomBase = getRandomSize(random);
                double trapezoidSide = getRandomSize(random);
                return new IsoscelesTrapezoid(topBase, bottomBase, trapezoidSide, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Colors.WHITE.name());
    }

    private double getRandomSize(Random random) {
        return random.nextDouble() * (MAX_SIZE - MIN_SIZE) + MIN_SIZE;
    }

    public int getFigureCount() {
        return FIGURE_COUNT;
    }
}
