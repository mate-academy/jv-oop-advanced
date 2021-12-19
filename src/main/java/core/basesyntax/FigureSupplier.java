package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 20;
    private static final int MAX_NUMBER_RANDOM_FIGURE = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int value = random.nextInt(MAX_RANDOM_VALUE);

        for (int i = 0; i < MAX_NUMBER_RANDOM_FIGURE; i++) {
            if (random.nextInt(MAX_NUMBER_RANDOM_FIGURE) == 1) {
                return new Rectangle(colorSupplier
                        .getRandomColor()
                        .toString(), value, value);
            } else if (random.nextInt(MAX_NUMBER_RANDOM_FIGURE) == 2) {
                return new RightTriangle(colorSupplier
                        .getRandomColor()
                        .toString(), value);
            } else if (random.nextInt(MAX_NUMBER_RANDOM_FIGURE) == 3) {
                return new IsoscelesTrapezoid(colorSupplier
                        .getRandomColor()
                        .toString(), value, value, value);
            } else if (random.nextInt(MAX_NUMBER_RANDOM_FIGURE) == 4) {
                return new Square(colorSupplier
                        .getRandomColor()
                        .toString(), value);
            } else if (random.nextInt(MAX_NUMBER_RANDOM_FIGURE) == 5) {
                return new Circle(colorSupplier
                        .getRandomColor()
                        .toString(), value);
            }
        }
        return getRandomFigure();
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorsEnum.WHITE.toString(), 10);
    }

}
