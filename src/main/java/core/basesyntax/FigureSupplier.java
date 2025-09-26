package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_FIGURE_COUNT = 5;
    private static final int MAX_PARAMETER = 10;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(MAX_FIGURE_COUNT);
        int firstSide = random.nextInt(MAX_PARAMETER) + 1;
        int secondSide = random.nextInt(MAX_PARAMETER) + 1;
        int height = random.nextInt(MAX_PARAMETER) + 1;
        String color = colorSupplier.getRandomColor();

        return switch (randomFigure) {
            case 0 -> new Square(firstSide, color);
            case 1 -> new Rectangle(firstSide, secondSide, color);
            case 2 -> new RightTriangle(firstSide, secondSide, color);
            case 3 -> new Circle(firstSide, color);
            case 4 -> new IsoscelesTrapezoid(firstSide, secondSide, height, color);
            default -> getDefaultFigure();
        };

    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name());
    }
}
