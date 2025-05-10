package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_NUMBER = 5;
    private static final int MAX_NUMBER = 10;
    private static final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private int generateRandomSide() {
        return random.nextInt(MAX_NUMBER) + 1;
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
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
        return new Circle("white", 10);
    }

    private Figure createRandomSquare(String color) {
        int side = generateRandomSide();
        return new Square(color, side);
    }

    private Figure createRandomIsoscelesTrapezoid(String color) {
        int upperBase = generateRandomSide();
        int lowerBase = generateRandomSide();
        int height = generateRandomSide();
        return new IsoscelesTrapezoid(color, upperBase, lowerBase, height);
    }

    private Figure createRandomCircle(String color) {
        int radius = generateRandomSide();
        return new Circle(color, radius);
    }

    private Figure createRandomRightTriangle(String color) {
        int firstLeg = generateRandomSide();
        int secondLeg = generateRandomSide();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createRandomRectangle(String color) {
        int sideA = generateRandomSide();
        int sideB = generateRandomSide();
        return new Rectangle(color, sideA, sideB);
    }
}
