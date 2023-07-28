package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_LENGTH_RANGE;
    public static final int FIGURE_COUNT;
    private final ColorSupplier colorSupplier;
    private final Random random;

    static {
        FIGURE_LENGTH_RANGE = 10;
        FIGURE_COUNT = 5;
    }

    {
        colorSupplier = new ColorSupplier();
        random = new Random();
    }

    public Figure getRandomFigure() {
        int figureIndex = random.nextInt(FIGURE_COUNT + 1);
        switch (figureIndex) {
            case 1:
                return createCircle();
            case 2:
                return createSquare();
            case 3:
                return createRectangle();
            case 4:
                return createRightTriangle();
            default:
                return createIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", FIGURE_LENGTH_RANGE);
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
        double width = getResizedSideLength(length, length);
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
        double baseTwo = getResizedSideLength(baseOne, baseOne);
        double height = getRandomSideLength();
        return new IsoscelesTrapezoid(color, baseOne, baseTwo, height);
    }

    private double getRandomSideLength() {
        return random.nextDouble() * FIGURE_LENGTH_RANGE;
    }

    private boolean isNeedToResize(double a, double b) {
        double delta = 0.00001;
        return Math.abs(a - b) < delta;
    }

    private double getResizedSideLength(double a, double b) {
        while (isNeedToResize(a, b)) {
            b = getRandomSideLength();
        }
        return b;
    }
}
