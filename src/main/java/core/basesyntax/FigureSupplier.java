package core.basesyntax;

import core.basesyntax.model.Circle;
import core.basesyntax.model.IsoscelesTrapezoid;
import core.basesyntax.model.Rectangle;
import core.basesyntax.model.RightTriangle;
import core.basesyntax.model.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int RANDOM_MAX = 10;
    private static final int RANDOM_MIN_OFFSET = 1;

    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Drawable getRandomFigure() {
        int type = random.nextInt(FIGURE_TYPES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0 -> {
                int side = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                return new Square(color, side);
            }
            case 1 -> {
                int width = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                int height = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                return new Rectangle(color, width, height);
            }
            case 2 -> {
                int firstLeg = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                int secondLeg = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                return new RightTriangle(color, firstLeg, secondLeg);
            }
            case 3 -> {
                int radius = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                return new Circle(color, radius);
            }
            default -> {
                int base1 = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                int base2 = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                int height = random.nextInt(RANDOM_MAX) + RANDOM_MIN_OFFSET;
                return new IsoscelesTrapezoid(color, base1, base2, height);
            }
        }
    }

    public Drawable getDefaultFigure() {
        return new Circle("white", DEFAULT_CIRCLE_RADIUS);
    }
}
