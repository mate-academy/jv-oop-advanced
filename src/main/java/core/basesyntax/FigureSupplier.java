package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN_RANDOM_VALUE = 1.0;
    private static final double MAX_RANDOM_VALUE = 20.0;
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier(ColorSupplier colorSupplier) {
        this.colorSupplier = colorSupplier;
        this.random = new Random();
    }

    public Figure getRandomFigure() {
        Figure randomFigure;
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                double squareSide = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                randomFigure = new Square(squareSide, color);
                break;
            case 1:
                double rectangleLength = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                double rectangleWidth = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                randomFigure = new Rectangle(rectangleLength, rectangleWidth, color);
                break;
            case 2:
                double triangleLeg1 = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                double triangleLeg2 = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                randomFigure = new RightTriangle(triangleLeg1, triangleLeg2, color);
                break;
            case 3:
                double circleRadius = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                randomFigure = new Circle(circleRadius, color);
                break;
            case 4:
                double trapezoidBase1 = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                double trapezoidBase2 = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                double trapezoidHeight = getRandomDoubleInRange(MIN_RANDOM_VALUE, MAX_RANDOM_VALUE);
                randomFigure = new IsoscelesTrapezoid(trapezoidBase1, trapezoidBase2,
                        trapezoidHeight, color);
                break;
            default:
                randomFigure = getDefaultFigure();
                break;
        }
        return randomFigure;
    }

    private double getRandomDoubleInRange(double min, double max) {
        return min + (max - min) * random.nextDouble();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
