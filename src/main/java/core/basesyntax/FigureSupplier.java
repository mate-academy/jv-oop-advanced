package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_RANDOM_VALUE = 10000;
    public static final double VALUE_SCALE = 100.0;
    public static final String DEFAULT_COLOR = "Black";
    public static final double DEFAULT_SIZE = 1.0;
    public static final String DEFAULT_SQUARE_COLOR = "White";
    public static final double DEFAULT_SQUARE_SIZE = 10.0;

    private static final Random random = new Random();
    private static final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), generateRandomValue());
            case 1:
                return new Circle(colorSupplier.getRandomColor(), generateRandomValue());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue(), generateRandomValue());
            default:
                return new Circle(DEFAULT_COLOR, DEFAULT_SIZE);
        }
    }

    public Figure getDefaultFigure() {
        return new Square(DEFAULT_SQUARE_COLOR, DEFAULT_SQUARE_SIZE);
    }

    private double generateRandomValue() {
        return (random.nextInt(MAX_RANDOM_VALUE) + 1) / VALUE_SCALE;
    }
}
