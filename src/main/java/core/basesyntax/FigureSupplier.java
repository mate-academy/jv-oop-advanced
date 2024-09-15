package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SHAPE_RANDOM_BOUND = FigureEnum.values().length;
    private static final int VALUE_RANDOM_BOUND = 20;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        FigureEnum figure = FigureEnum.values()[random.nextInt(SHAPE_RANDOM_BOUND)];
        String color = colorSupplier.getRandomColor();
        int valueFirst = random.nextInt(VALUE_RANDOM_BOUND);
        int valueSecond = random.nextInt(VALUE_RANDOM_BOUND);
        int valueThird = random.nextInt(VALUE_RANDOM_BOUND);
        switch (figure) {
            case CIRCLE: {
                return new Circle(color, generateRandomValue());
            }
            case ISOSCELES_TRAPEZOID: {
                return new IsoscelesTrapezoid(color, generateRandomValue(), generateRandomValue(),
                        generateRandomValue());
            }
            case RECTANGLE: {
                return new Rectangle(color, generateRandomValue(), generateRandomValue());
            }
            case RIGHT_TRIANGLE: {
                return new RightTriangle(color, generateRandomValue(), generateRandomValue());
            }
            default: {
                return new Square(color, generateRandomValue());
            }
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_VALUE);
    }

    private int generateRandomValue() {
        return random.nextInt(VALUE_RANDOM_BOUND);
    }
}
