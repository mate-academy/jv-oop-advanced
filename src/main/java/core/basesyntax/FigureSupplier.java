package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 5;
    private static final double MAX_DIMENSION = 10.0;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int type = random.nextInt(BOUND);
        String color = colorSupplier.getRandomColor();
        switch (type) {
            case 0:
                double side = getRandomDimension();
                return new Square(side, color);
            case 1:
                double length = getRandomDimension();
                double width = getRandomDimension();
                return new Rectangle(length, width, color);
            case 2:
                double firstLeg = getRandomDimension();
                double secondLeg = getRandomDimension();
                return new RightTriangle(firstLeg, secondLeg, color);
            case 3:
                double radius = getRandomDimension();
                return new Circle(radius, color);
            default:
                double topBase = getRandomDimension();
                double bottomBase = getRandomDimension();
                double height = getRandomDimension();
                return new IsoscelesTrapezoid(topBase, bottomBase, height, color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomDimension() {
        return random.nextDouble() * MAX_DIMENSION + 1;
    }
}
