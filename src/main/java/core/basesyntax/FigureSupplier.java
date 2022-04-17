package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_RANDOM_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType randomType = FigureType.values()[index];
        double firstSide = random.nextInt(MAX_RANDOM_VALUE);
        double secondSide = random.nextInt(MAX_RANDOM_VALUE);
        switch (randomType) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        firstSide);
            case TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), firstSide, secondSide,
                        random.nextInt(MAX_RANDOM_VALUE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(), firstSide, secondSide);
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(), firstSide);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), DEFAULT_CIRCLE_RADIUS);
    }
}
