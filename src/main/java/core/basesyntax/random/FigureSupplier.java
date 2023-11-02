package core.basesyntax.random;

import core.basesyntax.figure.Figure;
import core.basesyntax.figuretype.Circle;
import core.basesyntax.figuretype.IsoscelesTrapezoid;
import core.basesyntax.figuretype.Rectangle;
import core.basesyntax.figuretype.RightTriangle;
import core.basesyntax.figuretype.Square;
import java.util.Random;

public class FigureSupplier {
    public static final int MAX_VALUE = 10;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_VALUE)) {
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

    public int getRandomValue(int maxValue) {
        return random.nextInt(maxValue);
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(getRandomValue(MAX_VALUE));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setLeftSide(getRandomValue(MAX_VALUE));
        isoscelesTrapezoid.setRightSide(getRandomValue(MAX_VALUE));
        isoscelesTrapezoid.setHeight(getRandomValue(MAX_VALUE));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(getRandomValue(MAX_VALUE));
        rectangle.setWidth(getRandomValue(MAX_VALUE));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(getRandomValue(MAX_VALUE));
        rightTriangle.setSecondLeg(getRandomValue(MAX_VALUE));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setSide(getRandomValue(MAX_VALUE));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }
}
