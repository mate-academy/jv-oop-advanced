package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MAX_RANDOM_VALUE = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "WHITE";

    private final Random rand = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = rand.nextInt(FIGURE_TYPES_COUNT);
        switch (type) {
            case 0:
                double radius = rand.nextDouble() * MAX_RANDOM_VALUE;
                return new Circle(colorSupplier.getRandomColor(), radius);
            case 1:
                double width = rand.nextDouble() * MAX_RANDOM_VALUE;
                double height = rand.nextDouble() * MAX_RANDOM_VALUE;
                return new Rectangle(colorSupplier.getRandomColor(), width, height);
            case 2:
                double firstLeg = rand.nextDouble() * MAX_RANDOM_VALUE;
                double secondLeg = rand.nextDouble() * MAX_RANDOM_VALUE;
                return new RightTriangle(colorSupplier.getRandomColor(), firstLeg, secondLeg);
            case 3:
                int topBase = rand.nextInt(MAX_RANDOM_VALUE);
                int bottomBase = rand.nextInt(MAX_RANDOM_VALUE);
                int heightBase = rand.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), topBase, bottomBase, heightBase);
            case 4:
                double side = rand.nextDouble() * MAX_RANDOM_VALUE;
                return new Square(colorSupplier.getRandomColor(), side);
            default:
                return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}