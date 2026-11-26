package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private static final int MAX_SIZE = 100;
    private static final int MIN_SIZE = 1;
    private static final int DEFAULT_RADIUS = 10;
    private static final int CIRCLE_INDEX = 0;
    private static final int RECTANGLE_INDEX = 1;
    private static final int SQUARE_INDEX = 2;
    private static final int RIGHT_TRIANGLE_INDEX = 3;
    private static final int ISOSCELES_TRAPEZOID_INDEX = 4;
    private static final int FIGURE_COUNT = 5;

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        int randomValue = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomValue1 = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomValue2 = random.nextInt(MIN_SIZE, MAX_SIZE);
        int randomIndex = random.nextInt(FIGURE_COUNT);
        switch (randomIndex) {
            case CIRCLE_INDEX:
                Circle circle = new Circle(color, randomValue);
                return circle;
            case RECTANGLE_INDEX:
                Rectangle rectangle = new Rectangle(color, randomValue, randomValue1);
                return rectangle;
            case SQUARE_INDEX:
                Square square = new Square(color, randomValue);
                return square;
            case RIGHT_TRIANGLE_INDEX:
                RightTriangle rightTriangle = new RightTriangle(color, randomValue, randomValue1);
                return rightTriangle;
            case ISOSCELES_TRAPEZOID_INDEX:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(color, randomValue, randomValue1, randomValue2);
                return isoscelesTrapezoid;
            default:
                return getDefaultFigure();
        }

    }

    public Figure getDefaultFigure() {
        String white = Color.WHITE.name();
        Circle circle = new Circle(white, DEFAULT_RADIUS);
        return circle;
    }
}
