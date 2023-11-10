package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RANDOM_BOUND = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);
        switch (figureType) {
            case 0:
                double squareSide = random.nextDouble(DEFAULT_RANDOM_BOUND);
                String squareColor = colorSupplier.getRandomColor();
                return new Square(squareColor, squareSide);
            case 1:
                double rectangleHeight = random.nextDouble(DEFAULT_RANDOM_BOUND);
                double rectangleLength = random.nextDouble(DEFAULT_RANDOM_BOUND);
                String rectangleColor = colorSupplier.getRandomColor();
                return new Rectangle(rectangleColor, rectangleHeight, rectangleLength);
            case 2:
                double rightTriangleFirstLeg = random.nextDouble(DEFAULT_RANDOM_BOUND);
                double rightTriangleSecondLeg = random.nextDouble(DEFAULT_RANDOM_BOUND);
                String rightTriangleColor = colorSupplier.getRandomColor();
                return new RightTriangle(rightTriangleColor, rightTriangleFirstLeg,
                        rightTriangleSecondLeg);
            case 3:
                double circleRadius = random.nextDouble(DEFAULT_RANDOM_BOUND);
                String circleColor = colorSupplier.getRandomColor();
                return new Circle(circleColor, circleRadius);
            default:
                double isoscelesTrapezoidTopBase = random.nextDouble(DEFAULT_RANDOM_BOUND);
                double isoscelesTrapezoidBottomBase = random.nextDouble(DEFAULT_RANDOM_BOUND);
                double isoscelesTrapezoidHeight = random.nextDouble(DEFAULT_RANDOM_BOUND);
                String isoscelesTrapezoidColor = colorSupplier.getRandomColor();
                return new IsoscelesTrapezoid(isoscelesTrapezoidColor, isoscelesTrapezoidTopBase,
                        isoscelesTrapezoidBottomBase, isoscelesTrapezoidHeight);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
