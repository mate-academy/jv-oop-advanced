package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    public static final int MAX_SIDE_LENGTH = 20;
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
                return createRightTriangle(color);
            case 4:
                return createCircle(color);
            default:
                return createIsoscelesTrapezoid(color);
        }
    }

    private Figure createSquare(String color) {
        int side = random.nextInt(MAX_SIDE_LENGTH);
        return new Square(color, side);
    }

    private Figure createRectangle(String color) {
        int firstSide = random.nextInt(MAX_SIDE_LENGTH);
        int secondSide = random.nextInt(MAX_SIDE_LENGTH);
        return new Rectangle(color, firstSide, secondSide);
    }

    private Figure createRightTriangle(String color) {
        int firstLeg = random.nextInt(MAX_SIDE_LENGTH);
        int secondLeg = random.nextInt(MAX_SIDE_LENGTH);
        return new Rectangle(color, firstLeg, secondLeg);
    }

    private Figure createCircle(String color) {
        int radius = random.nextInt(MAX_SIDE_LENGTH);
        return new Circle(color, radius);
    }

    private Figure createIsoscelesTrapezoid(String color) {
        int firstBase = random.nextInt(MAX_SIDE_LENGTH);
        int secondBase = random.nextInt(MAX_SIDE_LENGTH);
        int firstLeg = random.nextInt(MAX_SIDE_LENGTH);
        int secondLeg = random.nextInt(MAX_SIDE_LENGTH);
        int height = random.nextInt(MAX_SIDE_LENGTH);
        return new IsoscelesTrapezoid(color, firstBase, secondBase, firstLeg,
                secondLeg, height);
    }
}
