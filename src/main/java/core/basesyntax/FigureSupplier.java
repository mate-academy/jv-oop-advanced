package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 4;
    private static final double RADIUS_OF_DEFAULT_FIGURE = 10.00;
    private static final String COLOR_OF_DEFAULT_FIGURE = Color.WHITE.name().toLowerCase();
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomDigit = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor().toLowerCase();

        switch (randomDigit) {
            case 0:
                double radius = minAndMaxDimension();
                return new Circle(color, radius);
            case 1:
                double side = minAndMaxDimension();
                return new Square(color, side);
            case 2:
                double firstLeg = minAndMaxDimension();
                double secondLeg = minAndMaxDimension();
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                double rectangleHeight = minAndMaxDimension();
                double width = minAndMaxDimension();
                return new Rectangle(color, rectangleHeight, width);
            default:
                double height2 = minAndMaxDimension();
                double topBase = minAndMaxDimension();
                double bottomBase = minAndMaxDimension();
                return new IsoscelesTrapezoid(color, height2, topBase, bottomBase);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(COLOR_OF_DEFAULT_FIGURE, RADIUS_OF_DEFAULT_FIGURE);
    }

    private double minAndMaxDimension() {
        int minDimension = 1;
        int maxDimension = 10;

        return minDimension * random.nextDouble() * maxDimension;
    }
}

