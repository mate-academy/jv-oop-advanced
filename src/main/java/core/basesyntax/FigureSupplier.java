package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 20;
    private static final int FIGURE_TYPE = 5;
    private static final String DEFAULT_COLOR = "White";
    private static final int DEFAULT_RADIUS = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_TYPE);
        switch (index) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomSquare();
            case 4:
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    protected Figure getDefaultCircle() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }

    protected Figure getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor().name());
        square.setSquareSide(random.nextInt(FIGURE_COUNT));
        return square;
    }

    protected Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor().name());
        rightTriangle.setFirstLeg(random.nextInt(FIGURE_COUNT));
        rightTriangle.setSecondLeg(random.nextInt(FIGURE_COUNT));
        return rightTriangle;
    }

    protected Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor().name());
        rectangle.setWidth(random.nextInt(FIGURE_COUNT));
        rectangle.setLength(random.nextInt(FIGURE_COUNT));;
        return rectangle;
    }

    protected Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(FIGURE_COUNT));
        circle.setColor(colorSupplier.getRandomColor().name());
        return circle;
    }

    protected Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor().name());
        isoscelesTrapezoid.setSideOne(FIGURE_COUNT);
        isoscelesTrapezoid.setSideTwo(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setHeight(random.nextInt(FIGURE_COUNT));
        return isoscelesTrapezoid;
    }
}
