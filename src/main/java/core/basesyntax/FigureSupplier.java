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

            case 0:
                return new Circle(color, randomSize());

            case 1:
                return new Rectangle(color, randomSize(), randomSize());

            case 2:
                return new RightTriangle(color, randomSize(), randomSize());

            case 3:
                return new Square(color, randomSize());

            default:
                return new IsoscelesTrapezoid(color, randomSize(), randomSize(), randomSize());

        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int randomSize() {
        return random.nextInt(MAX_RANDOM_SIZE - MIN_RANDOM_SIZE + 1) + MIN_RANDOM_SIZE;
    }
}
