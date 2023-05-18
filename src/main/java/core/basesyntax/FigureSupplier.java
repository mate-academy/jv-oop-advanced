package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final int RANDOM_MULTIPLIER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FigureNames.values().length);
        String randomColor = colorSupplier.getRandomColor();

        switch (FigureNames.values()[figureNumber]) {
            case CIRCLE:
                return new Circle(getDouble(), randomColor);
            case RECTANGLE:
                return new Rectangle(getDouble(), getDouble(), randomColor);
            case RIGHT_TRIANGLE:
                return new RightTriangle(getDouble(), getDouble(), randomColor);
            case SQUARE:
                return new Square(getDouble(),randomColor);
            case ISISCELES_TRAPEZOID:
                double equalSides = getDouble();
                return new IsoscelesTrapezoid(getDouble(),equalSides, getDouble(),randomColor);
            default:
                throw new IllegalArgumentException("Wrong figure type");
        }
    }

    private double getDouble() {
        return random.nextDouble() * RANDOM_MULTIPLIER;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
