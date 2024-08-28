package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double BOUND = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FigureType.values().length);
        FigureType figureType = FigureType.values()[figureIndex];
        String randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randDouble(), randDouble(), randDouble(),
                        randomColor);
            case CIRCLE:
                return new Circle(randDouble(),randomColor);
            case RECTANGLE:
                return new Rectangle(randDouble(), randDouble(), randomColor);
            case RIGHT_TRIANGLE:
                return new RightTriangle(randDouble(), randDouble(), randomColor);
            case SQUARE:
                return new Square(randDouble(), randomColor);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double randDouble() {
        return random.nextDouble(BOUND);
    }
}
