package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double MIN_LENGTH_RANGE = 1;
    private static final double MAX_LENGTH_RANGE = 10;
    private static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier;
    private final Random random;

    public FigureSupplier() {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureIndex) {
            case 0:
                return createCircle(color);
            case 1:
                return createSquare(color);
            case 2:
                return createRectangle(color);
            case 3:
                return createRightTriangle(color);
            default:
                return createIsoscelesTrapezoid(color);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), MAX_LENGTH_RANGE);
    }

    private Circle createCircle(String color) {
        double radius = getRandomSideLength();
        return new Circle(color, radius);
    }

    private Square createSquare(String color) {
        double side = getRandomSideLength();
        return new Square(color, side);
    }

    private Rectangle createRectangle(String color) {
        double length = getRandomSideLength();
        double width = getRandomSideLength();
        return new Rectangle(color, length, width);
    }

    private RightTriangle createRightTriangle(String color) {
        double firstLeg = getRandomSideLength();
        double secondLeg = getRandomSideLength();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid(String color) {
        double baseOne = getRandomSideLength();
        double baseTwo = getRandomSideLength();
        double height = getRandomSideLength();
        return new IsoscelesTrapezoid(color, baseOne, baseTwo, height);
    }

    private double getRandomSideLength() {
        return MIN_LENGTH_RANGE + random.nextDouble() * (MAX_LENGTH_RANGE - MIN_LENGTH_RANGE);
    }
}
