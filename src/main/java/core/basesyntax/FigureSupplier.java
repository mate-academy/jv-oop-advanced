package core.basesyntax;

import java.util.Random;

class FigureSupplier {
    public static final Random random = new Random();
    public static final String DEFAULT_COLOR = Color.WHITE.name();
    public static final int CIRCLE_SIZE = 10;
    public static final ColorSupplier colorSupplier = new ColorSupplier();

    public int randomSide(int maxSize) {
        return random.nextInt(maxSize);
    }

    public Figure getRandomFigure(int maxSize) {
        String color = colorSupplier.getRandomColor();
        int randFigureIndex = random.nextInt(FigureType.values().length);
        FigureType figure = FigureType.values()[randFigureIndex];
        switch (figure) {
            case RECTANGLE:
                return new Rectangle(color, randomSide(maxSize), randomSide(maxSize));
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, randomSide(maxSize), randomSide(maxSize));
            case CIRCLE:
                return new Circle(color, randomSide(maxSize));
            case SQUARE:
                return new Square(color, randomSide(maxSize));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color,
                        randomSide(maxSize),
                        randomSide(maxSize),
                        randomSide(maxSize));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, CIRCLE_SIZE);
    }
}
