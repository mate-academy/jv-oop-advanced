package core.basesyntax;

import java.util.Random;

public class FigureProducer {
    private static final int COUNT_OF_FIGURE_IMPLEMENTATIONS = 5;
    private ColorProducer color = new ColorProducer();

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(COUNT_OF_FIGURE_IMPLEMENTATIONS);
        switch (randomGeneratedIndex) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getRectangle();
            case 3:
                return getRightTriangle();
            case 4:
            default:
                return getIsoscelesTrapezoid();
        }
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(new Random().nextInt(100));
        circle.setColor(color.getColor());
        return circle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setSideLengthA(new Random().nextInt(100));
        square.setColor(color.getColor());
        return square;
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSideLengthA(new Random().nextInt(100));
        rectangle.setSideLengthB(new Random().nextInt(100));
        rectangle.setColor(color.getColor());
        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setSideLengthA(new Random().nextInt(100));
        rightTriangle.setSideLengthB(new Random().nextInt(100));
        rightTriangle.setColor(color.getColor());
        return rightTriangle;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setEqualSides(new Random().nextInt(100));
        isoscelesTrapezoid.setSideLengthA(new Random().nextInt(100));
        isoscelesTrapezoid.setSideLengthB(new Random().nextInt(100));
        isoscelesTrapezoid.setColor(color.getColor());
        return isoscelesTrapezoid;
    }

}
