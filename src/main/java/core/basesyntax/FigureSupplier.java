package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double BOUND = 10.0;
    private static final String circleColor = "white";
    private static final double circleRadius = 10;
    private FigureType figureType;
    private int figureIndex;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        figureIndex = random.nextInt(FigureType.values().length);
        figureType = FigureType.values()[figureIndex];
        switch (figureType) {
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(randDouble(), randDouble(), randDouble(),
                        colorSupplier.getRandomColor());
            case CIRCLE:
                return new Circle(randDouble(),colorSupplier.getRandomColor());
            case RECTANGLE:
                return new Rectangle(randDouble(), randDouble(),
                        colorSupplier.getRandomColor());
            case RIGHT_TRIANGLE:
                return new RightTriangle(randDouble(), randDouble(),
                        colorSupplier.getRandomColor());
            case SQUARE:
                return new Square(randDouble(), colorSupplier.getRandomColor());
            default:
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(circleRadius, circleColor);
    }

    private double randDouble() {
        return random.nextDouble(BOUND);
    }
}
