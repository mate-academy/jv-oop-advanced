package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private int maxColorValue = 5;
    private String defaultColor = "white";
    private int defaultRadius = 10;

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
        int radius = random.nextInt(10);
        return new Circle(radius, colorSupplier.getRandomColor());
    }

    public Figure getRandomIsoscelesTrapezoid() {
        int height = random.nextInt(10);
        int base1 = random.nextInt(10);
        int base2 = random.nextInt(10);
        return new IsoscelesTrapezoid(height, base1, base2, colorSupplier.getRandomColor());
    }

    public Figure getRandomRectangle() {
        int height = random.nextInt(10);
        int width = random.nextInt(10);
        return new Rectangle(height, width, colorSupplier.getRandomColor());
    }

    public Figure getRandomRightTriangle() {
        int side = random.nextInt(10);
        int base = random.nextInt(10);
        return new RightTriangle(side, base, colorSupplier.getRandomColor());
    }

    public Figure getRandomSquare() {
        int side = random.nextInt(10);
        return new Square(side, colorSupplier.getRandomColor());
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultRadius, defaultColor);
    }
}
