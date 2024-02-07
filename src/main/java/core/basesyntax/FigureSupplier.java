package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int LIMIT_VALUE = 100;
    private static final int CIRCLE_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupply = new ColorSupplier();

    public Figure generateRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomRectangle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Figure getRandomSquare() {
        Square square = new Square();
        square.setColor(colorSupply.getRandomColor());
        square.setSide(random.nextInt(LIMIT_VALUE));
        return square;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setColor(colorSupply.getRandomColor());
        rectangle.setWidth(random.nextInt(LIMIT_VALUE));
        rectangle.setLength(random.nextInt(LIMIT_VALUE));
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setColor(colorSupply.getRandomColor());
        rightTriangle.setHeight(random.nextInt(LIMIT_VALUE));
        rightTriangle.setBase(random.nextInt(LIMIT_VALUE));
        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setColor(colorSupply.getRandomColor());
        isoscelesTrapezoid.setHeight(random.nextInt(LIMIT_VALUE));
        isoscelesTrapezoid.setShorterBase(random.nextInt(LIMIT_VALUE));
        isoscelesTrapezoid.setLongerBase(random.nextInt(LIMIT_VALUE));
        return isoscelesTrapezoid;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Color.WHITE.toString().toLowerCase());
        circle.setRadius(CIRCLE_RADIUS);
        return circle;
    }
}
