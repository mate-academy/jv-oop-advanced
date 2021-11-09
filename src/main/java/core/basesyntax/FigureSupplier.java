package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final int DEFAULT_CIRCLE_RADIUS = 10;
    private final String DEFAULT_CIRCLE_COLOR = Color.WHITE.toString();
    private final int MAX_RANDOM_VALUE = 100;
    private Random random = new Random();

    public Figure getRandomFigure() {
        FigureType randomFigureType = FigureType.values()[random.nextInt(FigureType.values().length)];
        String randomColor = new ColorSupplier().getRandomColor();
        switch (randomFigureType) {
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
            default:
                int firstSide = random.nextInt(MAX_RANDOM_VALUE);
                int secondSide = random.nextInt(MAX_RANDOM_VALUE);
                int height = random.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(randomColor, firstSide, secondSide, height);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
