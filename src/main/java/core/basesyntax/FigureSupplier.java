package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_SIDE_VALUE = 20;
    private final Random random = new Random();
    private final Shape[] shapes = Shape.values();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(shapes.length);
        switch (shapes[randomNumber]) {
            case CIRCLE:
                return prepareCircle();
            case SQUARE:
                return prepareSquare();
            case RECTANGLE:
                return prepareRectangle();
            case RIGHT_TRIANGLE:
                return prepareRightTriangle();
            case ISOSCELES_TRAPEZOID:
                return prepareIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Square prepareSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(MAX_SIDE_VALUE));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Rectangle prepareRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setFirstSide(random.nextInt(MAX_SIDE_VALUE));
        rectangle.setSecondSide(random.nextInt(MAX_SIDE_VALUE));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private IsoscelesTrapezoid prepareIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setFirstSide(random.nextInt(MAX_SIDE_VALUE));
        isoscelesTrapezoid.setSecondSide(random.nextInt(MAX_SIDE_VALUE));
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_SIDE_VALUE));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    private RightTriangle prepareRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(MAX_SIDE_VALUE));
        rightTriangle.setSecondLeg(random.nextInt(MAX_SIDE_VALUE));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Circle prepareCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(MAX_SIDE_VALUE));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }
}
