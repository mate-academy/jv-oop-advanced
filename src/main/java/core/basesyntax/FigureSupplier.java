package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_SIZE = 10;
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        return switch (figureType) {
            case 0 -> new Square(getRandomSize(), color);
            case 1 -> new Rectangle(getRandomSize(), getRandomSize(), color);
            case 2 -> new RightTriangle(getRandomSize(), getRandomSize(), color);
            case 3 -> new Circle(getRandomSize(), color);
            case 4 -> new IsoscelesTrapezoid(
                    getRandomSize(),
                    getRandomSize(),
                    getRandomSize(),
                    color
            );
            default -> new Circle(
                    DEFAULT_RADIUS,
                    DEFAULT_COLOR
            );
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private int getRandomSize() {
        return random.nextInt(MAX_RANDOM_SIZE) + 1;
    }
}
