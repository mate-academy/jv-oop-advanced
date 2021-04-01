package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure get() {
        int randomGeneratedIndex = new Random().nextInt(NUMBER_OF_FIGURES);
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
        rectangle.setRectangle(new Random().nextDouble(),
                new Random().nextDouble(), new Random().nextDouble());
        rectangle.setColor(colorSupplier.getColor());
        rectangle.calculateArea();
        rectangle.draw();
        return rectangle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setSquare(new Random().nextDouble());
        square.setColor(colorSupplier.getColor());
        square.calculateArea();
        square.draw();
        return square;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setIsoscelesTrapezoid(new Random().nextDouble(),
                new Random().nextDouble(),
                new Random().nextDouble(), new Random().nextDouble(), new Random().nextDouble());
        isoscelesTrapezoid.setColor(colorSupplier.getColor());
        isoscelesTrapezoid.calculateArea();
        isoscelesTrapezoid.draw();
        return isoscelesTrapezoid;
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(new Random().nextDouble());
        circle.setColor(colorSupplier.getColor());
        circle.calculateArea();
        circle.draw();
        return circle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setRightTriangle(new Random().nextDouble(),
                new Random().nextDouble(), new Random().nextDouble());
        rightTriangle.setColor(colorSupplier.getColor());
        rightTriangle.calculateArea();
        rightTriangle.draw();
        return rightTriangle;
    }
}
