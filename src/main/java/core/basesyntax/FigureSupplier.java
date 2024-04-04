package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_NUMBER = 10;
    private Random random = new Random();

    public Figure getRandomFigure() {
        String color = ColorSupplier.getRandomColor();
        int figureType = random.nextInt(FIGURE_NUMBER);

        switch (figureType) {
            case 0:
                return createRandomSquare(color);
            case 1:
                return createRandomIsoscelesTrapezoid(color);
            case 2:
                return createRandomCircle(color);
            case 3:
                return createRandomRightTriangle(color);
            case 4:
                return createRandomRectangle(color);
            default:
                return createRandomSquare(color);
        }
    }

    public Figure getDefaultFigure() {
        int figureType = random.nextInt(FIGURE_NUMBER);
        String color = "white";

        switch (figureType) {
            case 0:
                return new Square(color, 10);
            case 1:
                return new IsoscelesTrapezoid(color, 10, 5, 5);
            case 2:
                return new Circle(color, 10);
            case 3:
                return new RightTriangle(color, 10, 10);
            case 4:
                return new Rectangle(color, 10, 5);
            default:
                return new Circle(color, 10);
        }
    }

    private Figure createRandomSquare(String color) {
        int side = random.nextInt(MAX_NUMBER) + 1;
        return new Square(color, side);
    }

    private Figure createRandomIsoscelesTrapezoid(String color) {
        int upperBase = random.nextInt(MAX_NUMBER) + 1;
        int lowerBase = random.nextInt(MAX_NUMBER) + 1;
        int height = random.nextInt(MAX_NUMBER) + 1;
        return new IsoscelesTrapezoid(color, upperBase, lowerBase, height);
    }

    private Figure createRandomCircle(String color) {
        int radius = random.nextInt(MAX_NUMBER) + 1;
        return new Circle(color, radius);
    }

    private Figure createRandomRightTriangle(String color) {
        int firstLeg = random.nextInt(MAX_NUMBER) + 1;
        int secondLeg = random.nextInt(MAX_NUMBER) + 1;
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createRandomRectangle(String color) {
        int sideA = random.nextInt(MAX_NUMBER) + 1;
        int sideB = random.nextInt(MAX_NUMBER) + 1;
        return new Rectangle(color, sideA, sideB);
    }
}
