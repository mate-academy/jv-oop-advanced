package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_NUMBER = 28;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private String randomColor = colorSupplier.getRandomColor();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomCircle(randomColor);
            case 1:
                return getRandomIsoscelesTrapezoid(randomColor);
            case 3:
                return getRandomRectangle(randomColor);
            case 4:
                return getRandomRightTriangle(randomColor);
            default:
                return getRandomSquare(randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private Figure getRandomCircle(String color) {
        int side = random.nextInt(MAX_NUMBER);
        return new Circle(color, side);
    }

    private Figure getRandomIsoscelesTrapezoid(String color) {
        int upperTrapezoid = random.nextInt(MAX_NUMBER);
        int lowerTrapezoid = random.nextInt(MAX_NUMBER);
        int height = random.nextInt(MAX_NUMBER);
        return new IsoscelesTrapezoid(color, upperTrapezoid, lowerTrapezoid, height);
    }

    private Figure getRandomRectangle(String color) {
        int length = random.nextInt(MAX_NUMBER);
        int width = random.nextInt(MAX_NUMBER);
        return new Rectangle(color, length, width);
    }

    private Figure getRandomRightTriangle(String color) {
        int firstLeg = random.nextInt(MAX_NUMBER);
        int secondLeg = random.nextInt(MAX_NUMBER);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure getRandomSquare(String color) {
        int side = random.nextInt(MAX_NUMBER);
        return new Square(color, side);
    }
}
