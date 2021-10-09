package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIDE_LENGTH = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();

        switch (figureNumber) {
            case 1:
                return createSquare(color);
            case 2:
                return createRectangle(color);
            case 3:
                return createCircle(color);
            case 4:
                return createTriangle(color);
            default:
                return createTrapezoid(color);
        }
    }

    private Figure createSquare(String color) {
        int side = random.nextInt(MAX_SIDE_LENGTH);
        return new Square(side, color);
    }

    private Figure createRectangle(String color) {
        int firstSide = random.nextInt(MAX_SIDE_LENGTH);
        int secondSide = random.nextInt(MAX_SIDE_LENGTH);
        return new Rectangle(firstSide, secondSide, color);
    }

    private Figure createCircle(String color) {
        int radius = random.nextInt(MAX_SIDE_LENGTH);
        return new Circle(radius, color);
    }

    private Figure createTriangle(String color) {
        int firstLeg = random.nextInt(MAX_SIDE_LENGTH);
        int secondLeg = random.nextInt(MAX_SIDE_LENGTH);
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private Figure createTrapezoid(String color) {
        int topSide = random.nextInt(MAX_SIDE_LENGTH);
        int botSide = random.nextInt(MAX_SIDE_LENGTH);
        int height = random.nextInt(MAX_SIDE_LENGTH);
        return new IsoscelesTrapezoid(topSide, botSide, height, color);
    }
}
