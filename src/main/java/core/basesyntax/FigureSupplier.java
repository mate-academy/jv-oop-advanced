package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final double MAX_RANDOM_SIZE = 100.0;
    private static final double DEFAULT_RADIUS = 10.0;

    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        return switch (random.nextInt(FIGURE_TYPES_COUNT)) {
            case 0 -> new Circle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_RANDOM_SIZE);
            case 1 -> new Rectangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_RANDOM_SIZE,
                    random.nextDouble() * MAX_RANDOM_SIZE);
            case 2 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_RANDOM_SIZE,
                    random.nextDouble() * MAX_RANDOM_SIZE,
                    random.nextDouble() * MAX_RANDOM_SIZE);
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_RANDOM_SIZE,
                    random.nextDouble() * MAX_RANDOM_SIZE);
            case 4 -> new Square(colorSupplier.getRandomColor(),
                    random.nextDouble() * MAX_RANDOM_SIZE);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(colorSupplier.getDefaultColor(), DEFAULT_RADIUS);
    }
}
