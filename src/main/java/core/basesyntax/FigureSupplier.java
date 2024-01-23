package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private static final double DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int MAX_GEOMETRIC_PROPERTY_SIZE = 10;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        double circleRadius = getRandomValue();
        double firstRightTriangleLeg = getRandomValue();
        double secondRightTriangleLeg = getRandomValue();
        double squareSide = getRandomValue();
        double firstSideIsoscelesTrapezoid = getRandomValue();
        double secondSideIsoscelesTrapezoid = getRandomValue();
        double heightIsoscelesTrapezoid = getRandomValue();
        double rectangleLength = getRandomValue();
        double rectangleWidth = getRandomValue();

        switch (figureNumber) {
            case 0:
                return new Circle(randomColor, circleRadius);
            case 1:
                return new RightTriangle(firstRightTriangleLeg, secondRightTriangleLeg,
                        randomColor);
            case 2:
                return new Square(squareSide, randomColor);
            case 3:
                return new IsoscelesTrapezoid(firstSideIsoscelesTrapezoid,
                        secondSideIsoscelesTrapezoid,
                        heightIsoscelesTrapezoid,
                        randomColor);
            default:
                return new Rectangle(rectangleLength, rectangleWidth,
                        randomColor);
        }
    }

    private double getRandomValue() {
        return random.nextDouble(MAX_GEOMETRIC_PROPERTY_SIZE) + 1;
    }
}
