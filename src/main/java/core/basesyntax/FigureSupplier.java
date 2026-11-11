package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                double radius = getRandomDimension();
                return new Circle(color, radius);
            case 1:
                double side = getRandomDimension();
                return new Square(color, side);
            case 2:
                double length = getRandomDimension();
                double width = getRandomDimension();
                return new Rectangle(color, length, width);
            case 3:
                double firstLeg = getRandomDimension();
                double secondLeg = getRandomDimension();
                return new RightTriangle(color, firstLeg, secondLeg);
            default:
                double firstBase = getRandomDimension();
                double secondBase = getRandomDimension();
                double height = getRandomDimension();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomDimension() {
        int dimensionRange = MAX_DIMENSION - MIN_DIMENSION + 1;
        return random.nextInt(dimensionRange) + MIN_DIMENSION;
    }
}
