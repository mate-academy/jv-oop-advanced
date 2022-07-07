package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SHAPES = 5;
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (SHAPES) {
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getRandomCircle();
            case 3:
                return gerRandomSquare();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 5:
                return getRandomRectangle();
            default:
                return null;
        }
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(10));
        rightTriangle.setSecondLeg(random.nextInt(10));
        return rightTriangle;
    }

    public Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(10));
        return circle;
    }

    public Figure gerRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(10));
        return square;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(10));
        isoscelesTrapezoid.setLowerBase(random.nextInt(20));
        isoscelesTrapezoid.setUpperBase(random.nextInt(10));
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(random.nextInt(10));
        rectangle.setHeight(random.nextInt(10));
        return rectangle;
    }

    public Figure getDefaultFigure() {
        DefaultCircle defaultCircle = new DefaultCircle();
        return defaultCircle;
    }
}
