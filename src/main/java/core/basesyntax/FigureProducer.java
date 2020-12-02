package core.basesyntax;

import java.util.Random;

public class FigureProducer {

    private static final int UNI_LENGTH = new Random().nextInt(100);

    private ColorsProducer colorsProducer;

    public FigureProducer(ColorsProducer colorsProducer) {

        this.colorsProducer = colorsProducer;
    }

    public Figure getFigure() {

        int randomPointer = new Random().nextInt(6);

        switch (randomPointer) {
            case 1:
                return getCircle();
            case 2:
                return getIsoscelesTrapezoid();
            case 3:
                return getRectangle();
            case 4:
                return getRightTriangle();
            case 5:
            default:
                return getSquare();
        }

    }

    private Circle getCircle() {
        Circle circle = new Circle(colorsProducer.getColor(), UNI_LENGTH);
        circle.obtainArea();
        return circle;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid =
                new IsoscelesTrapezoid(colorsProducer.getColor(), UNI_LENGTH);
        isoscelesTrapezoid.obtainArea();
        return isoscelesTrapezoid;
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle(colorsProducer.getColor(), UNI_LENGTH);
        rectangle.obtainArea();
        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle =
                new RightTriangle(colorsProducer.getColor(), UNI_LENGTH);
        rightTriangle.obtainArea();
        return rightTriangle;
    }

    private Square getSquare() {
        Square square = new Square(colorsProducer.getColor(), UNI_LENGTH);
        square.obtainArea();
        return square;
    }
}
