package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int FIGURE_VALUE = 10;
    public static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        // generate a specific figure based on the `figureNumber` value
        return switch (figureNumber) {
            case 1 -> new RightTriangle(random.nextInt(FIGURE_VALUE) + 1,
                    random.nextInt(FIGURE_VALUE) + 1);
            case 2 -> new Rectangle(random.nextInt(FIGURE_VALUE) + 1,
                    random.nextInt(FIGURE_VALUE) + 1);
            case 3 -> new IsoscelesTrapezoid(random.nextInt(FIGURE_VALUE) + 1,
                    random.nextInt(FIGURE_VALUE) + 1, random.nextInt(FIGURE_VALUE) + 1);
            case 4 -> new Circle(random.nextInt(FIGURE_VALUE) + 1);
            default -> new Square(random.nextInt(FIGURE_VALUE) + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, "white");
    }
}
