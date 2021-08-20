package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int UNITS = 1000;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureNumber) {
            case 1:
                return getSquare(color);
            case 2:
                return getRectangle(color);
            case 3:
                return getCircle(color);
            case 4:
                return getRightTriangle(color);
            default:
                return getIsoscelesTrapezoid(color);
        }
    }

    private Figure getSquare(String color) {
        int side = random.nextInt(UNITS);
        return new Square(side, color);
    }

    private Figure getRectangle(String color) {
        int sideA = random.nextInt(UNITS);
        int sideB = random.nextInt(UNITS);
        return new Rectangle(sideA, sideB, color);
    }

    private Figure getCircle(String color) {
        int radius = random.nextInt(UNITS);
        return new Circle(radius, color);
    }

    private Figure getRightTriangle(String color) {
        int sideA = random.nextInt(UNITS);
        int sideB = random.nextInt(UNITS);
        return new RightTriangle(sideA, sideB, color);
    }

    private Figure getIsoscelesTrapezoid(String color) {
        int sideA = random.nextInt(UNITS);
        int sideB = random.nextInt(UNITS);
        int height = random.nextInt(UNITS);
        return new IsoscelesTrapezoid(sideA, sideB, height, color);
    }
}
