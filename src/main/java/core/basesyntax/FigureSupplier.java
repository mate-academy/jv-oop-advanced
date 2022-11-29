package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int AMOUNT = 4;
    private static final int MAX_VALUE = 5;
    private static final int MIN_VALUE = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private Random random = new Random();

    public Figure getRandomFigure() {
        if (getQuantityIndex() == 0) {
            return getSquare();
        } else if (getQuantityIndex() == 1) {
            return getRightTriangle();
        } else if (getQuantityIndex() == 2) {
            return getIsoscelesTrapezoid();
        } else if (getQuantityIndex() == 3) {
            return getCircle();
        } else {
            return getRectangle();
        }
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle(colorSupplier.getRandomColor(),
                getRandomParameters(), getRandomParameters());
        rectangle.drawFigure();
        return rectangle;
    }

    private Circle getCircle() {
        Circle circle = new Circle(colorSupplier.getRandomColor(), getRandomParameters());
        circle.drawFigure();
        return circle;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(colorSupplier
                .getRandomColor(), getRandomParameters(), getRandomParameters(),
                getRandomParameters());
        isoscelesTrapezoid.drawFigure();
        return isoscelesTrapezoid;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                getRandomParameters(), getRandomParameters());
        rightTriangle.drawFigure();
        return rightTriangle;
    }

    private Square getSquare() {
        Square square = new Square(DEFAULT_COLOR, getRandomParameters());
        square.drawFigure();
        return square;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
        circle.drawFigure();
        return circle;
    }

    private int getQuantityIndex() {
        return random.nextInt(AMOUNT);
    }

    private int getRandomParameters() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
