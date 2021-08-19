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
    private ColorSupplier randomColor = new ColorSupplier();
    private String color = randomColor.getRandomColor();

    public Figure getRandomFigure() {
        switch (random.nextInt(MAX_VALUE)) {
            case 0:
                return circle();
            case 1:
                return isoscelesTrapezoid();
            case 2:
                return rectangle();
            case 3:
                return rightTriangle();
            default:
                return square();
        }
    }

    public int getRandomValue(int maxValue) {
        return random.nextInt(maxValue);
    }

    private Circle circle() {
        Circle circle = new Circle();
        circle.setRadius(getRandomValue(MAX_VALUE));
        circle.setColor(color);
        return  circle;
    }

    private IsoscelesTrapezoid isoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setLeftSide(getRandomValue(MAX_VALUE));
        isoscelesTrapezoid.setRightSide(getRandomValue(MAX_VALUE));
        isoscelesTrapezoid.setHeight(getRandomValue(MAX_VALUE));
        isoscelesTrapezoid.setColor(color);
        return  isoscelesTrapezoid;
    }

    private Rectangle rectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(getRandomValue(MAX_VALUE));
        rectangle.setWidth(getRandomValue(MAX_VALUE));
        rectangle.setColor(color);
        return rectangle;
    }

    private RightTriangle rightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(getRandomValue(MAX_VALUE));
        rightTriangle.setSecondLeg(getRandomValue(MAX_VALUE));
        rightTriangle.setColor(color);
        return rightTriangle;
    }

    private Square square() {
        Square square = new Square();
        square.setSide(getRandomValue(MAX_VALUE));
        square.setColor(color);
        return square;
    }
}
