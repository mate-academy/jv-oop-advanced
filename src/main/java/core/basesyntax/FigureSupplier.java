package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    private static final double MIN_DIMENSION = 1.0;
    private static final double MAX_DIMENSION = 10.0;
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = "white";

    public Figure getRandomFigure() {
        Color color = colorSupplier.getRandomColor();
        FigureType figureType = getRandomFigureType();
        double dimension1 = random.nextDouble() * (MAX_DIMENSION - MIN_DIMENSION) + MIN_DIMENSION;
        double dimension2 = random.nextDouble() * (MAX_DIMENSION - MIN_DIMENSION) + MIN_DIMENSION;

        return switch (figureType) {
            case CIRCLE -> new Circle(color.name(), dimension1);
            case SQUARE -> new Square(color.name(), dimension1);
            case RECTANGLE -> new Rectangle(color.name(), dimension1, dimension2);
            case RIGHT_TRIANGLE -> new RightTriangle(color.name(), dimension1, dimension2);
            case ISOSCELES_TRAPEZOID -> {
                double dimension3 = random.nextDouble() * (MAX_DIMENSION - MIN_DIMENSION)
                        + MIN_DIMENSION;
                yield new IsoscelesTrapezoid(color.name(), dimension1, dimension2, dimension3);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private FigureType getRandomFigureType() {
        FigureType[] figureTypes = FigureType.values();
        return figureTypes[random.nextInt(figureTypes.length)];
    }
}
