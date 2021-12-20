package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_VALUE = 20;
    private static final int MAX_NUMBER_RANDOM_FIGURE = 6;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int value = random.nextInt(MAX_RANDOM_VALUE);

        switch (random.nextInt(MAX_NUMBER_RANDOM_FIGURE)) {
            case 1: {
                return new Rectangle(colorSupplier
                        .getRandomColor()
                        .toString(), value, value);
            } case 2: {
                return new RightTriangle(colorSupplier
                        .getRandomColor()
                        .toString(), value);
            } case 3: {
                return new IsoscelesTrapezoid(colorSupplier
                        .getRandomColor()
                        .toString(), value, value, value);
            } case 4: {
                return new Square(colorSupplier
                        .getRandomColor()
                        .toString(), value);
            } case 5: {
                return new Circle(colorSupplier
                        .getRandomColor()
                        .toString(), value);
            } default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(ColorsEnum.WHITE.toString(), 10);
    }

}
