package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;

    private static final int MIN_RANDOM_SIZE = 1;
    private static final int MAX_RANDOM_SIZE = 20;

    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0: {
                int radius = randomSize();
                return new Circle(color, radius);
            }
            case 1: {
                int width = randomSize();
                int height = randomSize();
                return new Rectangle(color, width, height);
            }
            case 2: {
                int firstLeg = randomSize();
                int secondLeg = randomSize();
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            case 3: {
                int side = randomSize();
                return new Square(color, side);
            }
            default: {
                int firstBase = randomSize();
                int secondBase = randomSize();
                int height = randomSize();
                return new IsoscelesTrapezoid(color, firstBase, secondBase, height);
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int randomSize() {
        return random.nextInt(MAX_RANDOM_SIZE - MIN_RANDOM_SIZE + 1) + MIN_RANDOM_SIZE;
    }
}
