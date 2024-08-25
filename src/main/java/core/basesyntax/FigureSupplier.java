package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double BOUND = 10.0;
    private static final Color CIRCLE_COLOR = Color.WHITE;
    private static final double CIRCLE_RADIUS = 10;
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
                return null;
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, CIRCLE_COLOR.name());
    }

    private double randDouble() {
        return random.nextDouble(BOUND);
    }
}
