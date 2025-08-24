package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES = 5;
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES);
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> {
                int radius = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                yield new Circle(color, radius);
            }
            case 1 -> {
                int width = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                int height = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                yield new Rectangle(color, width, height);
            }
            case 2 -> {
                int side = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                yield new Square(color, side);
            }
            case 3 -> {
                int firstLeg = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                int secondLeg = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                yield new RightTriangle(color, firstLeg, secondLeg);
            }
            case 4 -> {
                int upperBase = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                int lowerBase = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                int height = MIN_DIMENSION + random.nextInt(MAX_DIMENSION);
                yield new IsoscelesTrapezoid(color, upperBase, lowerBase, height);
            }
            default -> throw new IllegalStateException("Unexpected value: " + figureType);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
