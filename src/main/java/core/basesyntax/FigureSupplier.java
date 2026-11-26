package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 100;
    private static final int MIN_SIZE = 1;
    private static final int DEFAULT_RADIUS = 10;
    private static final int CIRCLE_INDEX = 0;
    private static final int RECTANGLE_INDEX = 1;
    private static final int SQUARE_INDEX = 2;
    private static final int RIGHT_TRIANGLE_INDEX = 3;
    private static final int ISOSCELES_TRAPEZOID_INDEX = 4;
    private static final int FIGURE_COUNT = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        int randomValue = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomValue1 = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomValue2 = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomIndex = random.nextInt(FIGURE_COUNT);
        switch (randomIndex) {
            case CIRCLE_INDEX:
                return new Circle(color, randomValue);
            case RECTANGLE_INDEX:
                return new Rectangle(color, randomValue, randomValue1);
            case SQUARE_INDEX:
                return new Square(color, randomValue);
            case RIGHT_TRIANGLE_INDEX:
                return new RightTriangle(color, randomValue, randomValue1);
            case ISOSCELES_TRAPEZOID_INDEX:
                return new IsoscelesTrapezoid(color, randomValue, randomValue1, randomValue2);
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        String white = Color.WHITE.name();
        return new Circle(white, DEFAULT_RADIUS);
    }
}
