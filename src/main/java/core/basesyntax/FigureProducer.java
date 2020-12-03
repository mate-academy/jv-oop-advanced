package core.basesyntax;

import java.util.Random;

public class FigureProducer {

    private static final int COUNT_OF_FIGURE_IMPLEMENTATIONS = 5;
    private ColorProducer colorProducer = new ColorProducer();

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(COUNT_OF_FIGURE_IMPLEMENTATIONS);
        switch (randomGeneratedIndex) {
            case 0:
                return getRectangle();
            case 1:
                return getSquare();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getCircle();
            case 4:
            default:
                return getRightTriangle();
        }
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setSides(new Random().nextInt(100), new Random().nextInt(100));
        rectangle.setColor(colorProducer.get());
        rectangle.calculateArea();
        return rectangle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setSide(new Random().nextInt(100));
        square.setColor(colorProducer.get());
        square.calculateArea();
        return square;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setIsoscelesTrapezoid(new Random().nextInt(100),
                new Random().nextInt(100), new Random().nextInt(100));
        isoscelesTrapezoid.setColor(colorProducer.get());
        isoscelesTrapezoid.calculateArea();
        return isoscelesTrapezoid;
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(new Random().nextInt(100));
        circle.setColor(colorProducer.get());
        circle.calculateArea();
        return circle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setLegs(new Random().nextInt(100), new Random().nextInt(100));
        rightTriangle.setColor(colorProducer.get());
        rightTriangle.calculateArea();
        return rightTriangle;
    }

}
