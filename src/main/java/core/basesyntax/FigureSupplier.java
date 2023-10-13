package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 5;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

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
            case 4:
                double topBase = getRandomDimension();
                double bottomBase = getRandomDimension();
                double height = getRandomDimension();
                return new IsoscelesTrapezoid(topBase, bottomBase, height, color);
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    private double getRandomDimension() {
        return random.nextDouble() * 10 + 1;
    }
}
