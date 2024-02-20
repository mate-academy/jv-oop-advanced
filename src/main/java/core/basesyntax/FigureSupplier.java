package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final double RANGE_VALUE = 20;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final double DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FigureType.values().length);
        FigureType randomFigure = FigureType.values()[index];
        switch (randomFigure) {
            case CIRCLE -> {
                return new Circle(colorSupplier.getRandomColor(), random.nextDouble(RANGE_VALUE));
            }
            case SQUARE -> {
                return new Square(colorSupplier.getRandomColor(), random.nextDouble(RANGE_VALUE));
            }
            case ISOSCELES_TRAPEZOID -> {
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        random.nextDouble(RANGE_VALUE),
                        random.nextDouble(RANGE_VALUE),
                        random.nextDouble(RANGE_VALUE));
            }
            case RECTANGLE -> {
                return new Rectangle(colorSupplier.getRandomColor(), random.nextDouble(RANGE_VALUE),
                        random.nextDouble(RANGE_VALUE));
            }
            case RIGHT_TRIANGLE -> {
                return new RightTriangle(colorSupplier.getRandomColor(),
                        random.nextDouble(RANGE_VALUE),
                        random.nextDouble(RANGE_VALUE));
            }
            default -> {
                throw new IllegalStateException("Can't recognize this figure type: " 
                    + randomFigure.name());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
