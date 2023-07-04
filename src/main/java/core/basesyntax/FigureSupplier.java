package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MIN_SIDE_LENGTH = 5;
    private static final int MAX_SIDE_LENGTH = 15;
    private static final int FIGURES_COUNT = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                String circleColor = colorSupplier.getRandomColor();
                int radius = getRandomSideLength();
                return new Circle(circleColor, radius);
            case 1:
                String trapezoidColor = colorSupplier.getRandomColor();
                double firstBase = getRandomSideLength();
                double secondBase = getRandomSideLength();
                double trapezoidSide = getRandomSideLength();
                return new IsoscelesTrapezoid(trapezoidColor, firstBase, secondBase, trapezoidSide);
            case 2:
                String rectangleColor = colorSupplier.getRandomColor();
                double firstSide = getRandomSideLength();
                double secondSide = getRandomSideLength();
                double thirdSide = getRandomSideLength();
                return new Rectangle(rectangleColor, firstSide, secondSide, thirdSide);
            case 3:
                String rightRectangleColor = colorSupplier.getRandomColor();
                int firstLeg = getRandomSideLength();
                int secondLeg = getRandomSideLength();
                return new RightTriangle(rightRectangleColor, firstLeg, secondLeg);
            case 4:
                String squareColor = colorSupplier.getRandomColor();
                int squareSide = getRandomSideLength();
                return new Square(squareColor, squareSide);
            default:
                return getDefaultFigure();
        }
    }

    private int getRandomSideLength() {
        return random.nextInt(MAX_SIDE_LENGTH) + MIN_SIDE_LENGTH;
    }
}
