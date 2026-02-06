package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MIN_SIZE = 1;
    private static final int MAX_SIZE = 20; // inclusive

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int typeOfFigure = random.nextInt(FIGURE_TYPES_COUNT);
        Color color = Color.valueOf(colorSupplier.getRandomColor().toUpperCase());

        return switch (typeOfFigure) {
            case 0 -> {
                double side = randomSize();
                yield new Square(color, side);
            }
            case 1 -> {
                double width = randomSize();
                double height = randomSize();
                yield new Rectangle(color, width, height);
            }
            case 2 -> {
                double firstLeg = randomSize();
                double secondLeg = randomSize();
                yield new RightTriangle(color, firstLeg, secondLeg);
            }
            case 3 -> {
                double radius = randomSize();
                yield new Circle(color, radius);
            }
            default -> {
                double largeBase = randomSize();
                double smallBase = randomSize();
                double height = randomSize();
                yield new IsoscelesTrapezoid(color, largeBase, smallBase, height);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }

    private double randomSize() {
        return MIN_SIZE + random.nextInt(MAX_SIZE - MIN_SIZE + 1);
    }
}
