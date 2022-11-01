package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_CIRCLE_COLOR = Colors.WHITE.name();
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureTypes figureType = FigureTypes.values()[random.nextInt(FigureTypes.values().length)];
        String color = colorSupplier.getRandomColor();

        switch (figureType) {
            case CIRCLE:
                return new Circle(color, random.nextInt(MAX_VALUE));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case RECTANGLE:
                return new Rectangle(color, random.nextInt(MAX_VALUE), random.nextInt(MAX_VALUE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(color, random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
            default:
                return new Square(color, random.nextInt(MAX_VALUE));
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }
}
