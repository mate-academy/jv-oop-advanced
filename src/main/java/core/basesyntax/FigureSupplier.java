package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 4;
    public static final Color DEFAULT_COLOR = Color.WHITE;
    public static final double DEFAULT_RADIUS = 10.0;
    public static final double MAX_RANDOM_VALUE = 10.0;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    private double getRandomValue() {
        return random.nextDouble() * MAX_RANDOM_VALUE;
    }

    public Figure getRandomFigure() {
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return createIsoscelesTrapezoid(color);
            case 1:
                return createCircle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createRectangle(color);
            default:
                return createSquare(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(Color color) {
        return new IsoscelesTrapezoid(color, getRandomValue(), getRandomValue(), getRandomValue());
    }

    private Circle createCircle(Color color) {
        return new Circle(color, getRandomValue());
    }

    private RightTriangle createRightTriangle(Color color) {
        return new RightTriangle(color, getRandomValue(), getRandomValue());
    }

    private Rectangle createRectangle(Color color) {
        return new Rectangle(color, getRandomValue(), getRandomValue());
    }

    private Square createSquare(Color color) {
        return new Square(color, getRandomValue());
    }
}
