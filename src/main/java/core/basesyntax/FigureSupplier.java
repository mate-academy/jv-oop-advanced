package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.toString();
    private static final int MAX_RANDOM_VALUE = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureType randFigureType = FigureType.values()[random.nextInt(FigureType.values().length)];
        String randomColor = new ColorSupplier().getRandomColor();
        switch (randFigureType) {
            case CIRCLE :
                int radius = random.nextInt(MAX_RANDOM_VALUE);
                return new Circle(randomColor, radius);
            case SQUARE:
                int squareSide = random.nextInt(MAX_RANDOM_VALUE);
                return new Square(randomColor, squareSide);
            case RECTANGLE:
                int sideA = random.nextInt(MAX_RANDOM_VALUE);
                int sideB = random.nextInt(MAX_RANDOM_VALUE);
                return new Rectangle(randomColor,sideA,sideB);
            case RIGHT_TRIANGLE:
                int firstLeg = random.nextInt(MAX_RANDOM_VALUE);
                int secondLeg = random.nextInt(MAX_RANDOM_VALUE);
                return new RightTriangle(randomColor, firstLeg, secondLeg);
            case ISOSCELES_TRAPEZOID:
                int firstSide = random.nextInt(MAX_RANDOM_VALUE);
                int secondSide = random.nextInt(MAX_RANDOM_VALUE);
                int height = random.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(randomColor, firstSide, secondSide, height);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
