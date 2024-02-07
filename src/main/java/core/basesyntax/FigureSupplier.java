package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT_OF_FIGURES = 5;
    private static final int MAX_RANDOM_VALUE = 100;
    private static final int CIRCLE_DEFAULT_RADIUS = 10;
    private static final Random RANDOM = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (RANDOM.nextInt(AMOUNT_OF_FIGURES)) {
            case 0:
                return new Rectangle(color, RANDOM.nextInt(MAX_RANDOM_VALUE) + 1,
                        RANDOM.nextInt(MAX_RANDOM_VALUE) + 1);
            case 1:
                return new Circle(color, RANDOM.nextInt(MAX_RANDOM_VALUE) + 1);
            case 2:
                return new IsoscelesTrapezoid(color, RANDOM.nextInt(MAX_RANDOM_VALUE) + 1,
                        RANDOM.nextInt(MAX_RANDOM_VALUE) + 1,
                        RANDOM.nextInt(MAX_RANDOM_VALUE) + 1);
            case 3:
                return new Square(color, RANDOM.nextInt(MAX_RANDOM_VALUE) + 1);
            default:
                return new RightTriangle("Right Triangle", color,
                        RANDOM.nextInt(MAX_RANDOM_VALUE) + 1,
                        RANDOM.nextInt(MAX_RANDOM_VALUE) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), CIRCLE_DEFAULT_RADIUS);
    }
}
