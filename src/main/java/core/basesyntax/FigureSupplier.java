package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_SIZE_OF_UNITS = 10;
    private Random random = new Random();

    private int getRandomNumber(int limit) {
        return random.nextInt(limit) + 1;
    }

    public Figure getRandomFigure() {
        int numberOfFigure = getRandomNumber(NUMBER_OF_FIGURES);
        Figure randomFigure;

        switch (numberOfFigure) {
            case 0:
                return createSquare();
            case 1:
                return createRectangle();
            case 2:
                return createRightTriangle();
            case 3:
                return createCircle();
            case 4:
            default:
                return createIsoscelesTrapezoid();
        }
    }

    private Figure createRectangle() {
        int length = random.nextInt(MAX_SIZE_OF_UNITS);
        int width = random.nextInt(MAX_SIZE_OF_UNITS);
        String color = new ColorSupplier().getRandomColor();
        return new Rectangle(color, length, width);
    }

    private Figure createSquare() {
        int side = random.nextInt(MAX_SIZE_OF_UNITS);
        String color = new ColorSupplier().getRandomColor();
        return new Square(color, side);
    }

    private Figure createRightTriangle() {
        int firstLeg = random.nextInt(MAX_SIZE_OF_UNITS);
        int secondLeg = random.nextInt(MAX_SIZE_OF_UNITS);
        String color = new ColorSupplier().getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createCircle() {
        int radius = getRandomNumber(MAX_SIZE_OF_UNITS);
        String color = new ColorSupplier().getRandomColor();
        return new Circle(color, radius);
    }

    private Figure createIsoscelesTrapezoid() {
        int topSide = getRandomNumber(MAX_SIZE_OF_UNITS);
        int bottomSide = getRandomNumber(MAX_SIZE_OF_UNITS);
        int side = getRandomNumber(MAX_SIZE_OF_UNITS);
        int height = getRandomNumber(MAX_SIZE_OF_UNITS);
        String color = new ColorSupplier().getRandomColor();
        return new IsoscelesTrapezoid(color, topSide, bottomSide, side, height);
    }
}
