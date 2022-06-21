package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_NUMBER = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        int index = random.nextInt(FigureType.values().length);
        switch (FigureType.values()[index]) {
            case CIRCLE:
                return getRandomCircle(color);
            case RECTANGLE:
                return getRandomRectangle(color);
            case TRAPEZOID:
                return getRandomTrapezoid(color);
            case SQUARE:
                return getRandomSquare(color);
            case TRIANGLE:
            default:
                return getRandomTriangle(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomSquare(String color) {
        int side = random.nextInt(MAX_RANDOM_NUMBER);
        return new Square(color, side);
    }

    private Figure getRandomCircle(String color) {
        int radius = random.nextInt(MAX_RANDOM_NUMBER);
        return new Circle(color,radius);
    }

    private Figure getRandomTriangle(String color) {
        int side = random.nextInt(MAX_RANDOM_NUMBER);
        return new RightTriangle(color, side);
    }

    private Figure getRandomRectangle(String color) {
        int sideA = random.nextInt(MAX_RANDOM_NUMBER);
        int sideB = random.nextInt(MAX_RANDOM_NUMBER);
        return new Rectangle(color,sideA,sideB);
    }

    private Figure getRandomTrapezoid(String color) {
        int top = random.nextInt(MAX_RANDOM_NUMBER);
        int bottom = random.nextInt(MAX_RANDOM_NUMBER);
        int height = random.nextInt(MAX_RANDOM_NUMBER);
        return new IsoscelesTrapezoid(color,top, bottom, height);
    }
}
