package core.basesyntax.model;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIZE_OF_UNITS = 50;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 0:
                return newCircle(color);
            case 1:
                return newRightTriangle(color);
            case 2:
                return newIsoscelesTrapezoid(color);
            case 3:
                return newSquare(color);
            default:
                return newRectangle(color);
        }
    }

    private Figure newCircle(String color) {
        int radius = random.nextInt(SIZE_OF_UNITS);
        return new Circle(color, radius);
    }

    private Figure newRightTriangle(String color) {
        int firstLeg = random.nextInt(SIZE_OF_UNITS);
        int secondLeg = random.nextInt(SIZE_OF_UNITS);
        return new RightTriangle(color,firstLeg, secondLeg);
    }

    private Figure newIsoscelesTrapezoid(String color) {
        int bottomSide = random.nextInt(SIZE_OF_UNITS);
        int topSide = random.nextInt(SIZE_OF_UNITS);
        int height = random.nextInt(SIZE_OF_UNITS);
        return new IsoscelesTrapezoid(color, bottomSide, topSide, height);
    }

    private Figure newSquare(String color) {
        int side = random.nextInt(SIZE_OF_UNITS);
        return new Square(color, side);
    }

    private Figure newRectangle(String color) {
        int sideA = random.nextInt(SIZE_OF_UNITS);
        int sideB = random.nextInt(SIZE_OF_UNITS);
        return new Rectangle(color, sideA, sideB);
    }
}
