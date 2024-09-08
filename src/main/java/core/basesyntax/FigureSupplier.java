package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIDE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureType = random.nextInt(5);
        switch (figureType) {
            case 0:
                return getRandomSquare(randomColor);
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

    public static final Figure getDefaultFigure() {
        return new Circle(10, "white");
    }

    private Square getRandomSquare() {
        double side = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Square(side, color);
    }

    private Rectangle getRandomRectangle() {
        double length = random.nextDouble(MAX_SIDE);
        double width = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Rectangle(length, width, color);
    }

    private Circle getRandomCircle() {
        double radius = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new Circle(radius, color);
    }

    private RightTriangle getRandomRightTriangle() {
        double firstLeg = random.nextDouble(MAX_SIDE);
        double secondLeg = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new RightTriangle(firstLeg, secondLeg, color);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        double base1 = random.nextDouble(MAX_SIDE);
        double base2 = random.nextDouble(MAX_SIDE);
        double height = random.nextDouble(MAX_SIDE);
        Color color = Color.valueOf(colorSupplier.getRandomColor());
        return new IsoscelesTrapezoid(base1, base2, height, color);
    }

    public Square getSquare() {
        return getRandomSquare();
    }

    public Rectangle getRectangle() {
        return getRandomRectangle();
    }

    public Circle getCircle() {
        return getRandomCircle();
    }

    public RightTriangle getRightTriangle() {
        return getRandomRightTriangle();
    }

    public IsoscelesTrapezoid getIsoscelesTrapezoid() {
        return getRandomIsoscelesTrapezoid();

    }
}
