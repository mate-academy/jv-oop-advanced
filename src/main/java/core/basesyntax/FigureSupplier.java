package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double SIZE_RANGE = 18;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private static final Figure DEFAULT_FIGURE = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType figureName = FigureType.values()[index];

        switch (figureName) {
            case CIRCLE:
                return new Circle(colorSupplier.getRandomColor(),
                        random.nextDouble(SIZE_RANGE));
            case SQUARE:
                return new Square(colorSupplier.getRandomColor(),
                        random.nextDouble(SIZE_RANGE));
            case RECTANGLE:
                return new Rectangle(colorSupplier.getRandomColor(),
                        random.nextDouble(SIZE_RANGE),
                        random.nextDouble(SIZE_RANGE));
            case RIGHT_TRIANGLE:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(SIZE_RANGE),
                        random.nextDouble(SIZE_RANGE));
            default:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(SIZE_RANGE),
                        random.nextDouble(SIZE_RANGE),
                        random.nextDouble(SIZE_RANGE));
        }
    }

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }
}
