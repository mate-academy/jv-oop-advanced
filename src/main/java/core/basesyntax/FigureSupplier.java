package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SIZE_COUNT = 15;
    private static final int DEFAULT_NUMBER = 10;
    private static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        Circle defaultCircle = new Circle();
        defaultCircle.setColor(DEFAULT_COLOR);
        defaultCircle.setRadius(DEFAULT_NUMBER);
        return defaultCircle;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor());
        circle.setRadius(random.nextInt(SIZE_COUNT));
        return circle;
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor());
        square.setSide(random.nextInt(SIZE_COUNT));
        return square;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor());
        rectangle.setFirstSide(random.nextInt(SIZE_COUNT));
        rectangle.setSecondSide(random.nextInt(SIZE_COUNT));
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor());
        rightTriangle.setFirstLeg(random.nextInt(SIZE_COUNT));
        rightTriangle.setSecondLeg(random.nextInt(SIZE_COUNT));
        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        isoscelesTrapezoid.setFirstBase(random.nextInt(SIZE_COUNT));
        isoscelesTrapezoid.setSecondBase(random.nextInt(SIZE_COUNT));
        isoscelesTrapezoid.setHeight(random.nextInt(SIZE_COUNT));
        return isoscelesTrapezoid;
    }
}
