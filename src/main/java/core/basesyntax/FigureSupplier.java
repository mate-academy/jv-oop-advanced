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
        String randomColor = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return getRandomSquare(randomColor);
            case 1:
                return getRandomRectangle(randomColor);
            case 2:
                return getRandomCircle(randomColor);
            case 3:
                return getRandomRightTriangle(randomColor);
            case 4:
                return getRandomIsoscelesTrapezoid(randomColor);
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

    public Square getSquare() {
        return getRandomSquare(colorSupplier.getRandomColor());
    }

    private Square getRandomSquare(String color) {
        double side = getRandomSideLength();
        return new Square(side, color);
    }

    public Rectangle getRectangle() {
        return getRandomRectangle(colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle(String color) {
        double width = getRandomSideLength();
        double height = getRandomSideLength();
        return new Rectangle(width, height, color);
    }

    public Circle getCircle() {
        return getRandomCircle(colorSupplier.getRandomColor());
    }

    private Circle getRandomCircle(String color) {
        double radius = getRandomSideLength();
        return new Circle(radius, color);
    }

    public RightTriangle getRightTriangle() {
        return getRandomRightTriangle(colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle(String color) {
        double base = getRandomSideLength();
        double height = getRandomSideLength();
        return new RightTriangle(base, height, color);
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return getRandomIsoscelesTrapezoid(colorSupplier.getRandomColor());
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid(String color) {
        double topBase = getRandomSideLength();
        double bottomBase = getRandomSideLength();
        double height = getRandomSideLength();
        return new IsoscelesTrapezoid(topBase, bottomBase, height, color);
    }
}