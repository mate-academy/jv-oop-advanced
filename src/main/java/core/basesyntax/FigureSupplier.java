package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = "white";
    private static final int MAX_FIGURE_DIMENSION = 40;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        return switch (random.nextInt(5)) {
            case 0 -> new Square(random.nextInt(MAX_FIGURE_DIMENSION),
                    colorSupplier.getRandomColor());
            case 1 -> new Rectangle(random.nextInt(MAX_FIGURE_DIMENSION),
                    random.nextInt(MAX_FIGURE_DIMENSION), colorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextInt(MAX_FIGURE_DIMENSION),
                    random.nextInt(MAX_FIGURE_DIMENSION), colorSupplier.getRandomColor());
            case 3 -> new Circle(random.nextInt(MAX_FIGURE_DIMENSION),
                    colorSupplier.getRandomColor());
            case 4 -> new IsoscelesTrapezoid(random.nextInt(MAX_FIGURE_DIMENSION),
                    random.nextInt(), random.nextInt(), colorSupplier.getRandomColor());
            default -> null;
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }
}
