package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final Color CIRCLE_COLOR = Color.WHITE;
    public static final int CIRCLE_SIZE = 10;
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();

    public Figure getRandomFigure(int maxSize) {
        String color = COLOR_SUPPLIER.getRandomColor();
        int randFigureIndex = RANDOM.nextInt(AvailableFigure.values().length);
        AvailableFigure figure = AvailableFigure.values()[randFigureIndex];
        switch (figure) {
            case RECTANGLE:
                int randRightSide = RANDOM.nextInt(maxSize);
                int randTopSide = RANDOM.nextInt(maxSize);
                return new Rectangle(color, randTopSide, randRightSide);
            case RIGHT_TRIANGLE:
                int randFirstLeg = RANDOM.nextInt(maxSize);
                int randSecondLeg = RANDOM.nextInt(maxSize);
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
        return new Circle(CIRCLE_COLOR.name(), CIRCLE_SIZE);
    }
}
