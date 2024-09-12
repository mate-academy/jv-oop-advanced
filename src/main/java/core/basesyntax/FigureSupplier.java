package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final double MAX_RANDOM_VALUE = 10.0;
    private static final int NUMBER_OF_FIGURES = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        Color color = colorSupplier.getRandomColor();

        switch (figureType) {
            case 0:
                double squareSide = getRandomValue();
                return new Square(color, squareSide);
            case 1:
                double rectangleWidth = getRandomValue();
                double rectangleHeight = getRandomValue();
                return new Rectangle(color, rectangleWidth, rectangleHeight);
            case 2:
                double triangleBase = getRandomValue();
                double triangleHeight = getRandomValue();
                return new RightTriangle(color, triangleBase, triangleHeight);
            case 3:
                double circleRadius = getRandomValue();
                return new Circle(color, circleRadius);
            case 4:
            default:
                double trapezoidUpperBase = getRandomValue();
                double trapezoidLowerBase = getRandomValue();
                double trapezoidHeight = getRandomValue();
                return new IsoscelesTrapezoid(color,
                        trapezoidUpperBase,
                        trapezoidLowerBase,
                        trapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_RADIUS);
    }

    private double getRandomValue() {
        return random.nextDouble() * MAX_RANDOM_VALUE;
    }
}
