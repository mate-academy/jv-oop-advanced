package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureType figureType = FigureType.values()[random.nextInt(FigureType.values().length)];
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case SQUARE:
                double squareSideLength = random.nextDouble() * 5;
                return Square.createSquare(squareSideLength, color);
            case CIRCLE:
                double circleRadius = random.nextDouble() * 5;
                return new Circle(circleRadius, color);
            case RIGHT_TRIANGLE:
                double rightTriangleFirstLeg = random.nextDouble() * 5;
                double rightTriangleSecondLeg = random.nextDouble() * 5;
                return new RightTriangle(rightTriangleFirstLeg, rightTriangleSecondLeg, color);

            case RECTANGLE:
                double rectangleLength = random.nextDouble() * 5;
                double rectangleWidth = random.nextDouble() * 5;
                return new Rectangle(rectangleLength, rectangleWidth, color);
            case ISOSCELES_TRAPEZOID:
                double isoscelesTrapezoidUpperBase = random.nextDouble() * 5;
                double isoscelesTrapezoidLowerBase = random.nextDouble() * 5;
                double isoscelesTrapezoidHeight = random.nextDouble() * 5;
                return new IsoscelesTrapezoid(isoscelesTrapezoidUpperBase,
                        isoscelesTrapezoidLowerBase, isoscelesTrapezoidHeight, color);
            default:
                return getDefaultFigure();

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS,DEFAULT_COLOR);
    }
}

