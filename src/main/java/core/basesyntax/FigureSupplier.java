package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final int FIGURE_COUNT = 5;
    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 10;
    private static final int DEAFULT_FIGURE_RADIUS = 10;
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int ran = RANDOM.nextInt(FIGURE_COUNT);
        int a = RANDOM.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        int b = RANDOM.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        int c = RANDOM.nextInt(MAX_LENGTH - MIN_LENGTH + 1) + MIN_LENGTH;
        return switch (ran) {
            case (0) -> new Square(a, colorSupplier.getRandomColor());
            case (1) -> new Rectangle(a, b, colorSupplier.getRandomColor());
            case (2) -> new RightTriangle(a, b, colorSupplier.getRandomColor());
            case (3) -> new Circle(a, Color.WHITE);
            default -> new IsoscelesTrapezoid(a, b, c, colorSupplier.getRandomColor());
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(DEAFULT_FIGURE_RADIUS, Color.WHITE);
    }
}
