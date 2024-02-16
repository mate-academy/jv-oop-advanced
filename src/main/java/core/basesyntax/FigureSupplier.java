package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final double MAX_RANDOM_VALUE = 20.0;
    public static final int FIGURE_TYPES_COUNT = 5;
    public static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier;
    private final Random random = new Random();

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
    }

    public FigureArea getRandomFigure() {

        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                double squareSide = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                return new Square(squareSide, color);
            case 1:
                double rectangleLength = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                double rectangleWidth = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                return new Rectangle(rectangleLength, rectangleWidth, color);
            case 2:
                double triangleLeg1 = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                double triangleLeg2 = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                return new RightTriangle(triangleLeg1, triangleLeg2, color);
            case 3:
                double circleRadius = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                return new Circle(circleRadius, color);
            default:
                double trapezoidBase1 = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                double trapezoidBase2 = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                double trapezoidHeight = getRandomDoubleInRange(1, MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(trapezoidBase1, trapezoidBase2, trapezoidHeight,
                        color);
        }
    }

    private double getRandomDoubleInRange(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    public FigureArea getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "white");
    }
}
