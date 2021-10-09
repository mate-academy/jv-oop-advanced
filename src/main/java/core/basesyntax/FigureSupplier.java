package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int NUMBER_OF_FIGURES = 5;
    public static final int MAX_SIZE_OF_UNITS = 10;
    private static Random random = new Random();

    public Figure getRandomFigure() {
        int numberOfFigure = random.nextInt(NUMBER_OF_FIGURES);
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
        int length = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        int width = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        String color = new ColorSupplier().getRandomColor();
        return new Rectangle(color, length, width);
    }

    private Figure createSquare() {
        int side = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        String color = new ColorSupplier().getRandomColor();
        return new Square(color, side);
    }

    private Figure createRightTriangle() {
        int firstLeg = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        int secondLeg = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        String color = new ColorSupplier().getRandomColor();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createCircle() {
        int radius = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        String color = new ColorSupplier().getRandomColor();
        return new Circle(color, radius);
    }

    private Figure createIsoscelesTrapezoid() {
        int topSide = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        int bottomSide = random.nextInt(MAX_SIZE_OF_UNITS) + 1;
        int side = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        int height = random.nextInt(MAX_SIZE_OF_UNITS + 1);
        String color = new ColorSupplier().getRandomColor();
        return new IsoscelesTrapezoid(color, topSide, bottomSide, side, height);
    }
}
