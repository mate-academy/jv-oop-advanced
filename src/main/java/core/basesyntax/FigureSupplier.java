package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBERS_OF_FIGURES = 5;
    public static final int MAX_PARAMETER_SIZE = 100;
    public static final int DEFAULT_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random randomInteger = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, ColorSupplier.DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        int randomFigure = randomInteger.nextInt(NUMBERS_OF_FIGURES);
        switch (randomFigure) {
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomCircle();
        }
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Color randomColor = colorSupplier.getRandomColor();
        int upperBase = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        int lowerBase = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        int height = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        return new IsoscelesTrapezoid(upperBase, lowerBase, height, randomColor);
    }

    private Figure getRandomRightTriangle() {
        Color randomColor = colorSupplier.getRandomColor();
        int base = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        return new RightTriangle(base, randomColor);
    }

    private Figure getRandomRectangle() {
        Color randomColor = colorSupplier.getRandomColor();
        int width = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        int height = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        return new Rectangle(width, height, randomColor);
    }

    private Figure getRandomSquare() {
        Color randomColor = colorSupplier.getRandomColor();
        int side = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        return new Square(side, randomColor);
    }

    private Figure getRandomCircle() {
        Color randomColor = colorSupplier.getRandomColor();
        int radius = randomInteger.nextInt(MAX_PARAMETER_SIZE) + 1;
        return new Circle(radius, randomColor);
    }
}
