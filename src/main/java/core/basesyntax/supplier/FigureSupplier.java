package core.basesyntax.supplier;

import core.basesyntax.figures.*;

import java.util.Random;

public class  FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final double DEFAULT_NUMBER = 10.0;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE_COUNT);
        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getRectangle();
            case 2:
                return getRightTriangle();
            case 3:
                return getSquare();
            default:
                return getIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultCircle() {
        Circle circle = new Circle();
        circle.setColor(DEFAULT_COLOR);
        circle.setRadius(DEFAULT_NUMBER);
        return circle;
    }

    private Circle getCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(FIGURE_COUNT));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Rectangle getRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(random.nextInt(FIGURE_COUNT));
        rectangle.setWidth(random.nextInt(FIGURE_COUNT));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private RightTriangle getRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setSide(random.nextInt(FIGURE_COUNT));
        rightTriangle.setHeight(random.nextInt(FIGURE_COUNT));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Square getSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(FIGURE_COUNT));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private IsoscelesTrapezoid getIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setFirstSide(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setSecondSide(random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }
}
