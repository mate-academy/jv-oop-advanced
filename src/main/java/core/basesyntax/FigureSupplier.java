package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_COLOR_VALUE = 5;
    private static final int MAX_RANDOM_VALUE = 10;
    private static final String DEFAULT_COLOR = ColorSupplier.Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(MAX_COLOR_VALUE);
        String randomColor = colorSupplier.getRandomColor();

        switch (randomNumber) {
            case 0:
                return getRandomCircle(randomColor);
            case 1:
                return getRandomIsoscelesTrapezoid(randomColor);
            case 2:
                return getRandomRectangle(randomColor);
            case 3:
                return getRandomRightTriangle(randomColor);
            default:
                return getRandomSquare(randomColor);
        }
    }

    private int getRandomSide() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    private Figure getRandomCircle(String randomColor) {
        int radius = random.nextInt(MAX_RANDOM_VALUE);
        return new Circle(radius, randomColor);
    }

    private Figure getRandomIsoscelesTrapezoid(String randomColor) {
        int height = getRandomSide();
        int base1 = getRandomSide();
        int base2 = getRandomSide();
        return new IsoscelesTrapezoid(height, base1, base2, randomColor);
    }

    private Figure getRandomRectangle(String randomColor) {
        int height = getRandomSide();
        int width = getRandomSide();
        return new Rectangle(height, width, randomColor);
    }

    private Figure getRandomRightTriangle(String randomColor) {
        int side = getRandomSide();
        int base = getRandomSide();
        return new RightTriangle(side, base, randomColor);
    }

    private Figure getRandomSquare(String randomColor) {
        int side = getRandomSide();
        return new Square(side, randomColor);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }
}
