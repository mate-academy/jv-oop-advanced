package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final double MIN_DIMENSION = 1.0;
    private static final double MAX_DIMENSION = 10.0;
    private static final double TRAPEZOID_BOTTOM_BASE_OFFSET = 4.0;
    private static final String DEFAULT_COLOR = "white";
    private static final double DEFAULT_RADIUS = 10.0;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0: {
                double radius = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                return new Circle(color, radius);
            }
            case 1: {
                double side = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                return new Square(color, side);
            }
            case 2: {
                double width = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                double height = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                return new Rectangle(color, width, height);
            }
            case 3: {
                double firstLeg = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                double secondLeg = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            case 4: {
                double topBase = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                double bottomBase = rndDouble(MIN_DIMENSION, MAX_DIMENSION)
                        + TRAPEZOID_BOTTOM_BASE_OFFSET;
                double height = rndDouble(MIN_DIMENSION, MAX_DIMENSION);
                return new IsoscelesTrapezoid(color, topBase, bottomBase, height);
            }
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private double rndDouble(double min, double max) {
        return min + random.nextDouble() * (max - min);
    }
}

