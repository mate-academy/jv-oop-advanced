package core.basesyntax;

import java.util.Random;

public class FigureGenerator {
    public static final int COUNTER_OF_FIGURE_IMPLEMENTATION = 5;

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(COUNTER_OF_FIGURE_IMPLEMENTATION);
        switch (randomGeneratedIndex) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            default:
                return getSquare();
        }
    }

    private Circle getCircle() {
        Circle circle = new Circle();

        circle.setName();
        circle.setRadius(new Random().nextInt(10));
        circle.setArea();
        circle.setColor();

        return circle;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();

        isoscelesTrapezoid.setName();
        isoscelesTrapezoid.setFirstLine(new Random().nextInt(10));
        isoscelesTrapezoid.setSecondLine(new Random().nextInt(10));
        isoscelesTrapezoid.setHeight(new Random().nextInt(10));
        isoscelesTrapezoid.setArea();
        isoscelesTrapezoid.setColor();

        return isoscelesTrapezoid;
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();

        rectangle.setName();
        rectangle.setFirstLine(new Random().nextInt(10));
        rectangle.setSecondLine(new Random().nextInt(10));
        rectangle.setArea();
        rectangle.setColor();

        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();

        rightTriangle.setName();
        rightTriangle.setFirstLine(new Random().nextInt(10));
        rightTriangle.setSecondLine(new Random().nextInt(10));
        rightTriangle.setArea();
        rightTriangle.setColor();

        return rightTriangle;
    }

    private Square getSquare() {
        Square square = new Square();

        square.setName();
        square.setFirstLine(new Random().nextInt(10));
        square.setArea();
        square.setColor();

        return square;
    }
}
