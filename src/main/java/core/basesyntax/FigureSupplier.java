package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final String CIRCLE_COLOR = WHITE;
    public static final int CIRCLE_SIZE = 10;

    public Figure getRandomFigure(int maxSize) {
        String color = ColorSupplier.getRandomColor();
        int randFigureIndex = RANDOM.nextInt(AvailableFigure.values().length);
        switch (AvailableFigure.values()[randFigureIndex].name()) {
            case RECTANGLE:
                int randRightSide = RANDOM.nextInt(maxSize);
                int randTopSide = RANDOM.nextInt(maxSize);
                return new Rectangle(color, randTopSide, randRightSide);
            case RIGHT_TRIANGLE:
                int randFirstLeg = rand.nextInt(maxSize);
                int randSecondLeg = rand.nextInt(maxSize);
                return new RightTriangle(color, randFirstLeg, randSecondLeg);
            case CIRCLE:
                int randRadius = RANDOM.nextInt(maxSize);
                return new Circle(color, randRadius);
            case SQUARE:
                int randSquareSide = RANDOM.nextInt(maxSize);
                return new Square(color, randSquareSide);
            case ISOSCELES_TRAPEZOID:
                int randSide = RANDOM.nextInt(maxSize);
                int randTop = RANDOM.nextInt(maxSize);
                int randBottom = RANDOM.nextInt(maxSize);
                return new IsoscelesTrapezoid(color, randTop, randBottom, randSide);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_COLOR, CIRCLE_SIZE);
    }
}
