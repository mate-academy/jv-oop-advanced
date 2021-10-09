package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int MAX_FIGURES_NUMBER = 10;
    private static final int MAX_LENGTH = 10;
    private static final int FIGURES_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNum = random.nextInt(FIGURES_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNum) {
            case 0:
                return createCircle(color);
            case 1:
                return createTrapezoid(color);
            case 2:
                return createRectangle(color);
            case 3:
                return createTriangle(color);
            default:
                return createSquare(color);
        }
    }

    private Figure createCircle(String color) {
        int radius = random.nextInt(MAX_LENGTH);
        return new Circle(color, radius);
    }

    private Figure createTrapezoid(String color) {
        int height = random.nextInt(MAX_LENGTH);
        int top = random.nextInt(MAX_LENGTH);
        int bottom = random.nextInt(MAX_LENGTH);
        return new IsoscelesTrapezoid(color, height, top, bottom);
    }

    private Figure createRectangle(String color) {
        int firstSide = random.nextInt(MAX_LENGTH);
        int secondSide = random.nextInt(MAX_LENGTH);
        return new Rectangle(color, firstSide, secondSide);
    }

    private Figure createTriangle(String color) {
        int firstLeg = random.nextInt(MAX_LENGTH);
        int secondLeg = random.nextInt(MAX_LENGTH);
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private Figure createSquare(String color) {
        int side = random.nextInt(MAX_LENGTH);
        return new Square(color, side);
    }
}
