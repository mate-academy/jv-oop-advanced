package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int MAX_SIDE_SIZE = 40;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int positiveMaxSideSize = Math.max(MAX_SIDE_SIZE, 1);
        return switch (random.nextInt(5)) {
            case 0 -> new Square(random.nextInt(positiveMaxSideSize),
                    colorSupplier.getRandomColor());
            case 1 -> new Rectangle(random.nextInt(positiveMaxSideSize),
                    random.nextInt(positiveMaxSideSize), colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextInt(positiveMaxSideSize),
                    random.nextInt(positiveMaxSideSize), colorSupplier.getRandomColor());
            case 3 -> new Circle(random.nextInt(positiveMaxSideSize),
                    colorSupplier.getRandomColor());
            default -> new IsoscelesTrapezoid(random.nextInt(positiveMaxSideSize),
                    random.nextInt(positiveMaxSideSize), random.nextInt(positiveMaxSideSize),
                    colorSupplier.getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
