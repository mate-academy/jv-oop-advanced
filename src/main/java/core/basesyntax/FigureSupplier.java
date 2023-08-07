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
        switch (figureIndex) {
            case 0:
                return createCircle();
            case 1:
                return createSquare();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return createIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", MAX_LENGTH_RANGE);
    }

    private Circle createCircle() {
        double radius = getRandomSideLength();
        String color = colorSupplier.getRandomColor();
        return new Circle(color, radius);
    }

    private Square createSquare() {
        String color = colorSupplier.getRandomColor();
        double side = getRandomSideLength();
        return new Square(color, side);
    }

    private Rectangle createRectangle() {
        String color = colorSupplier.getRandomColor();
        double length = getRandomSideLength();
        double width = getRandomSideLength();
        return new Rectangle(color, length, width);
    }

    private RightTriangle createRightTriangle() {
        String color = colorSupplier.getRandomColor();
        double firstLeg = getRandomSideLength();
        double secondLeg = getRandomSideLength();
        return new RightTriangle(color, firstLeg, secondLeg);
    }

    private IsoscelesTrapezoid createIsoscelesTrapezoid() {
        String color = colorSupplier.getRandomColor();
        double baseOne = getRandomSideLength();
        double baseTwo = getRandomSideLength();
        double height = getRandomSideLength();
        return new IsoscelesTrapezoid(color, baseOne, baseTwo, height);
    }

    private double getRandomSideLength() {
        return MIN_LENGTH_RANGE + random.nextDouble() * (MAX_LENGTH_RANGE - MIN_LENGTH_RANGE);
    }
}
