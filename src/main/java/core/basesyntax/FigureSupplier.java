package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_BOUNDS = 100;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public FigureType nameOfFigure() {
        int figureIndex = random.nextInt(FigureType.values().length);
        return FigureType.values()[figureIndex];
    }

    public Figure getRandomFigure() {
        switch (nameOfFigure()) {
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS));
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS));
            case ISOSCELES_TRAPEZOID:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS),
                        random.nextInt(NUMBER_BOUNDS));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
