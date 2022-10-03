package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int DIMENSIONS_LIMITER = 50;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier colors = new ColorSupplier();

    private int randomDimension() {
        return random.nextInt(DIMENSIONS_LIMITER) + 1;
    }

    public Figure getRandomFigure() {
        Figures randomFigure = Figures.values()[random.nextInt(Figures.values().length)];
        String figureColor = colors.getRandomColor();
        switch (randomFigure) {
            case CIRCLE:
                return new Circle(figureColor, randomDimension());
            case SQUARE:
                return new Square(figureColor, randomDimension());
            case RIGHT_TRIANGLE:
                return new RightTriangle(figureColor, randomDimension(), randomDimension());
            case RECTANGLE:
                return new Rectangle(figureColor, randomDimension(),randomDimension());
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(figureColor, randomDimension(),
                        randomDimension(), randomDimension());
            default: getDefaultFigure();
        }
        return getDefaultFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
