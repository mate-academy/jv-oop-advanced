package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";
    private Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Drawable getRandomFigure() {
        int value = random.nextInt(NUMBER_OF_FIGURES);
        String color = colorSupplier.getRandomColor();

        switch (value) {
            case 0:
                return createIsoscelesTrapezoid(color);
            case 1:
                return createCircle(color);
            case 2:
                return createRightTriangle(color);
            case 3:
                return createRectangle(color);
            case 4:
                return createSquare(color);
            default:
                return getDefaultFigure();
        }
    }

    public Drawable getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE) + 1;
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        return new IsoscelesTrapezoid(color, getRandomValue(), getRandomValue(),
                getRandomValue());
    }

    private Circle createCircle(String color) {
        return new Circle(color, getRandomValue());
    }

    private RightTriangle createRightTriangle(String color) {
        return new RightTriangle(color, getRandomValue(), getRandomValue());
    }

    private Rectangle createRectangle(String color) {
        return new Rectangle(color, getRandomValue(), getRandomValue());
    }

    private Square createSquare(String color) {
        return new Square(color, getRandomValue());
    }
}
