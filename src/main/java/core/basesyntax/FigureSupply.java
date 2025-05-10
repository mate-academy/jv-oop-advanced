package core.basesyntax;

import java.util.Random;

public class FigureSupply {
    private static final int FIGURE_COUNT = 5;
    private static final int LIMIT_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupply colorSupply = new ColorSupply();

    public Figure generateRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return getRandomShape();
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

    private Figure getRandomShape() {
        Square square = new Square();
        square.setName(Shape.SQUARE.toString());
        square.setColor(colorSupply.getRandomColor());
        square.setSide(random.nextInt(LIMIT_VALUE));
        return square;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setName(Shape.RECTANGLE.toString());
        rectangle.setColor(colorSupply.getRandomColor());
        rectangle.setWidth(random.nextInt(LIMIT_VALUE));
        rectangle.setLength(random.nextInt(LIMIT_VALUE));
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setName(Shape.RIGHT_TRIANGLE.toString());
        rightTriangle.setColor(colorSupply.getRandomColor());
        rightTriangle.setHeight(random.nextInt(LIMIT_VALUE));
        rightTriangle.setBase(random.nextInt(LIMIT_VALUE));
        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setName(Shape.ISOSCELES_TRAPEZOID.toString());
        isoscelesTrapezoid.setColor(colorSupply.getRandomColor());
        isoscelesTrapezoid.setHeight(random.nextInt(LIMIT_VALUE));
        isoscelesTrapezoid.setShorterBase(random.nextInt(LIMIT_VALUE));
        isoscelesTrapezoid.setLongerBase(random.nextInt(LIMIT_VALUE));
        return isoscelesTrapezoid;
    }

    private Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setName(Shape.CIRCLE.toString());
        circle.setColor(Color.WHITE.toString().toLowerCase());
        circle.setRadius(10);
        return circle;
    }
}
