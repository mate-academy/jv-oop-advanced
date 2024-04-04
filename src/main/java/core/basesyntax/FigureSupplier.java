package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 8;
    private static final String DEFAULT_COLOR = "Black";
    private static final int MAX_SIDE_SIZE = 29;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(5)) {
            case 0 -> new Square(random.nextInt(MAX_SIDE_SIZE),
                    colorSupplier.getRandomColor());
            case 1 -> new Rectangle(random.nextInt(MAX_SIDE_SIZE),
                    random.nextInt(MAX_SIDE_SIZE), colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextInt(MAX_SIDE_SIZE),
                    random.nextInt(MAX_SIDE_SIZE), colorSupplier.getRandomColor());
            case 3 -> new Circle(random.nextInt(MAX_SIDE_SIZE),
                    colorSupplier.getRandomColor());
            default -> new IsoscelesTrapezoid(random.nextInt(MAX_SIDE_SIZE),
                    random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
