package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 100;
    private static final int FIGURE_TYPE = 5;
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
                return getRandomIsoscelesTrapezoid();
            default:
                return getRandomFigure();
        }
    }

    protected Circle getDefaultCircle() {
        Circle circle = new Circle();
        circle.setColor("White");
        circle.setRadius(10);
        return circle;
    }

    protected Figure getRandomSquare() {
        int count = random.nextInt(FIGURE_COUNT);
        Square square = new Square();
        square.setColor(colorSupplier.getRandomColor().name());
        square.setSquareSide(count);
        square.getArea();
        return square;
    }

    protected Figure getRandomRightTriangle() {
        int count = random.nextInt(FIGURE_COUNT);
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupplier.getRandomColor().name());
        rightTriangle.setFirstLeg(count);
        rightTriangle.setSecondLeg(count);
        rightTriangle.getArea();
        return rightTriangle;
    }

    protected Figure getRandomRectangle() {
        int count = random.nextInt(FIGURE_COUNT);
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupplier.getRandomColor().name());
        rectangle.setWidth(count);
        rectangle.setLength(count);
        rectangle.getArea();
        return rectangle;
    }

    protected Figure getRandomCircle() {
        int count = random.nextInt(FIGURE_COUNT);
        Circle circle = new Circle();
        circle.setColor(colorSupplier.getRandomColor().name());
        circle.setRadius(count);
        circle.getArea();
        return circle;
    }

    protected Figure getRandomIsoscelesTrapezoid() {
        int count = random.nextInt(FIGURE_COUNT);
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor().name());
        isoscelesTrapezoid.setSide1(count);
        isoscelesTrapezoid.setSide2(count);
        isoscelesTrapezoid.setHeight(count);
        isoscelesTrapezoid.getArea();
        return isoscelesTrapezoid;
    }
}
