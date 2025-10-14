package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MIN_RANDOM_VALUE = 1;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                int side = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new Square(color, side);
            case 1:
                int width = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                int height = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new Rectangle(color, width, height);
            case 2:
                int firstLeg = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                int secondLeg = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                int radius = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new Circle(color, radius);
            case 4:
                int base1 = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                int base2 = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                int heightTrap = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(color, base1, base2, heightTrap);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
