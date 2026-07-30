package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_SIZE = 20;
    private static final int MIN_RANDOM_SIZE = 1;
    private static final int SQUARE_INDEX = 0;
    private static final int RECTANGLE_INDEX = 1;
    private static final int RIGHT_TRIANGLE_INDEX = 2;
    private static final int CIRCLE_INDEX = 3;
    private static final double DEFAULT_CIRCLE_RADIUS = 10.0;
    private static final String DEFAULT_CIRCLE_COLOR = "white";
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        return switch (figureIndex) {
            case SQUARE_INDEX -> {
                double side = getRandomSize();
                yield new Square(color, side);
            }
            case RECTANGLE_INDEX -> {
                double width = getRandomSize();
                double height = getRandomSize();
                yield new Rectangle(color, width, height);
            }
            case RIGHT_TRIANGLE_INDEX -> {
                double firstLeg = getRandomSize();
                double secondLeg = getRandomSize();
                yield new RightTriangle(color, firstLeg, secondLeg);
            }
            case CIRCLE_INDEX -> {
                double radius = getRandomSize();
                yield new Circle(color, radius);
            }
            default -> {
                double firstBase = getRandomSize();
                double secondBase = getRandomSize();
                double height = getRandomSize();
                yield new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            }
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    private int getRandomSize() {
        return random.nextInt(MAX_RANDOM_SIZE) + MIN_RANDOM_SIZE;
    }
}
