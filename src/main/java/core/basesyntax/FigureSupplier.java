package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int maxColorValue = 5;
    private static final int maxRandomValue = 10;
    private static final String defaultColor = String.valueOf(ColorSupplier.Color.WHITE);
    private static final int defaultRadius = 10;

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(maxColorValue);

        switch (randomNumber) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getRandomCircle() {
        int radius = random.nextInt(maxRandomValue);
        return new Circle(radius, colorSupplier.getRandomColor());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int height = random.nextInt(maxRandomValue);
        int base1 = random.nextInt(maxRandomValue);
        int base2 = random.nextInt(maxRandomValue);
        return new IsoscelesTrapezoid(height, base1, base2, colorSupplier.getRandomColor());
    }

    public Figure getRandomRectangle() {
        int height = random.nextInt(maxRandomValue);
        int width = random.nextInt(maxRandomValue);
        return new Rectangle(height, width, colorSupplier.getRandomColor());
    }

    public Figure getRandomRightTriangle() {
        int side = random.nextInt(maxRandomValue);
        int base = random.nextInt(maxRandomValue);
        return new RightTriangle(side, base, colorSupplier.getRandomColor());
    }

    public Figure getRandomSquare() {
        int side = random.nextInt(maxRandomValue);
        return new Square(side, colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, defaultColor);
    }
}
