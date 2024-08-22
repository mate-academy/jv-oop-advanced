package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_FIGURE_RADIUS = 10;
    private static final String DEFAULT_FIGURE_COLOR = Color.WHITE.name();
    private static final double RANDOM_SIDE_BOUND = 100.00;
    private static final double RANDOM_ANGLE_BOUND = 85.00;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_COUNT);
        String randomColor = colorSupplier.getRandomColor();
        switch (number) {
            case 0:
                return getCircle(randomColor);
            case 1:
                return getRectangle(randomColor);
            case 2:
                return getSquare(randomColor);
            case 3:
                return getIsoscelesTrapezoid(randomColor);
            default:
                return getRightTriangle(randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_FIGURE_COLOR, DEFAULT_FIGURE_RADIUS);
    }

    private RightTriangle getRightTriangle(String randomColor) {
        return new RightTriangle(randomColor, getRandomSize(), getRandomSize());
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid(String randomColor) {
        double baseAngle = random.nextDouble(RANDOM_ANGLE_BOUND);
        return new IsoscelesTrapezoid(randomColor, getRandomSize(), getRandomSize(),
                getRandomSize(), baseAngle);
    }

    private Square getSquare(String randomColor) {
        return new Square(randomColor, getRandomSize());
    }

    private Rectangle getRectangle(String randomColor) {
        return new Rectangle(randomColor, getRandomSize(), getRandomSize());
    }

    private Circle getCircle(String randomColor) {
        return new Circle(randomColor, getRandomSize());
    }

    private double getRandomSize() {
        return random.nextDouble(RANDOM_SIDE_BOUND);
    }
}
