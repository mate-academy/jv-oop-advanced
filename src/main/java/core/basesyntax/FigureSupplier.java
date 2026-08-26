package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_SIZE = 10;
    private static final double DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        return switch (index) {
            case 0 -> {
                int side = random.nextInt(MAX_SIZE) + 1;
                yield new Square(side, color);
            }
            case 1 -> {
                int width = random.nextInt(MAX_SIZE) + 1;
                int height = random.nextInt(MAX_SIZE) + 1;
                yield new Rectangle(width, height, color);
            }
            case 2 -> {
                int baseA = random.nextInt(MAX_SIZE) + 1;
                int height = random.nextInt(MAX_SIZE) + 1;
                int baseB = random.nextInt(MAX_SIZE) + 1;
                yield new IsoscelesTrapezoid(color, baseA, height, baseB);
            }
            case 3 -> {
                int firstLeg = random.nextInt(MAX_SIZE) + 1;
                int secondLeg = random.nextInt(MAX_SIZE) + 1;
                yield new RightTriangle(firstLeg, secondLeg, color);
            }
            default -> {
                int radius = random.nextInt(MAX_SIZE) + 1;
                yield new Circle(radius, color);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.toString());
    }
}
