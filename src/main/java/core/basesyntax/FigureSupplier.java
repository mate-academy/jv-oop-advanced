package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 100;
    private static final int MAX_RADIUS = 100;
    private static final int MAX_HEIGHT = 100;
    private static final int MAX_UPPER_BASE = 100;
    private static final int MAX_LOWER_BASE = 100;
    private static final int MAX_FIRST_SIDE = 100;
    private static final int MAX_SECOND_SIDE = 100;
    private static final int MAX_FIRST_LEG = 100;
    private static final int MAX_SECOND_LEG = 100;

    private Random random;
    private ColorSupplier colorSupplier;

    public FigureSupplier() {
        random = new Random();
        colorSupplier = new ColorSupplier();
    }

    public Figure getRandomFigure() {
        FigureType type = FigureType.values()[random.nextInt(FigureType.values().length)];
        Color color = colorSupplier.getRandomColor();
        switch (type) {
            case SQUARE:
                return new Square(color, random.nextInt(MAX_SIDE));

            case CIRCLE:
                return new Circle(color, MAX_RADIUS);

            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(color, MAX_UPPER_BASE, MAX_LOWER_BASE, MAX_HEIGHT);

            case RECTANGLE:
                return new Rectangle(color, MAX_FIRST_SIDE, MAX_SECOND_SIDE);

            case RIGHT_TRIANGLE:
                return new RightTriangle(color, MAX_FIRST_LEG, MAX_SECOND_LEG);

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
