package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final double DEFAULT_RADIUS = 10.0;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int MAX_SIDE = 100;
    private static final int FIGURE_TYPE_COUNT = 5;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(FIGURE_TYPE_COUNT);
        switch (figureType) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomCircle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public static Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomSideLength() {
        return random.nextDouble(MAX_SIDE);
    }


    private Square getRandomSquare() {
        double side = getRandomSideLength();
        return new Square(side, colorSupplier.getRandomColor());
    }


    private Rectangle getRandomRectangle() {
        double width = getRandomSideLength();
        double height = getRandomSideLength();
        return new Rectangle(width, height, colorSupplier.getRandomColor());
    }


    private Circle getRandomCircle() {
        double radius = getRandomSideLength();
        return new Circle(radius, colorSupplier.getRandomColor());
    }


    private RightTriangle getRandomRightTriangle() {
        double base = getRandomSideLength();
        double height = getRandomSideLength();
        return new RightTriangle(base, height, colorSupplier.getRandomColor());
    }


    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double topBase = getRandomSideLength();
        double bottomBase = getRandomSideLength();
        double height = getRandomSideLength();
        return new IsoscelesTrapezoid(topBase, bottomBase, height, colorSupplier.getRandomColor());
    }
}
