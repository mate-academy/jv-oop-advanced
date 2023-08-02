package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_AMOUNT = 5;
    private static final int LENGTH_LIMIT = 100;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int DEFAULT_LENGTH = 10;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int value = random.nextInt(FIGURES_AMOUNT) + 1;
        switch (value) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomCircle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getRandomSquare() {
        String color = colorSupplier.getRandomColor();
        int squareSide = random.nextInt(LENGTH_LIMIT) + 1;
        return new Square(color, squareSide);
    }

    public Figure getRandomRectangle() {
        String color = colorSupplier.getRandomColor();
        int width = random.nextInt(LENGTH_LIMIT) + 1;
        int length = random.nextInt(LENGTH_LIMIT) + 1;
        return new Rectangle(color, width, length);
    }

    public Figure getRandomRightTriangle() {
        String color = colorSupplier.getRandomColor();
        int base = random.nextInt(LENGTH_LIMIT) + 1;
        int height = random.nextInt(LENGTH_LIMIT) + 1;
        return new RightTriangle(color, base, height);
    }

    public Figure getRandomCircle() {
        String color = colorSupplier.getRandomColor();
        int radius = random.nextInt(LENGTH_LIMIT) + 1;
        return new Circle(color, radius);
    }

    public Figure getRandomIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        int baseLength1 = random.nextInt(LENGTH_LIMIT) + 1;
        int baseLength2 = random.nextInt(LENGTH_LIMIT) + 1;
        int height = random.nextInt(LENGTH_LIMIT) + 1;
        return new IsoscelesTrapezoid(color, baseLength1, baseLength2, height);
    }

    public Figure getDefaultFigure() {
        String color = DEFAULT_COLOR;
        int radius = DEFAULT_LENGTH;
        return new Circle(color, radius);
    }
}
