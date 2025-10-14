package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int MIN_RANDOM_VALUE = 1;
    private static final int MAX_RANDOM_VALUE = 10;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        int width, height, side, firstLeg, secondLeg, base1, base2, radius, heightTrap;

        switch (type) {
            case 0:
                side = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new Square(color, side);
            case 1:
                width = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                height = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new Rectangle(color, width, height);
            case 2:
                firstLeg = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                secondLeg = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new RightTriangle(color, firstLeg, secondLeg);
            case 3:
                radius = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new Circle(color, radius);
            case 4:
                base1 = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                base2 = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                heightTrap = MIN_RANDOM_VALUE + random.nextInt(MAX_RANDOM_VALUE);
                return new IsoscelesTrapezoid(color, base1, base2, heightTrap);
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
