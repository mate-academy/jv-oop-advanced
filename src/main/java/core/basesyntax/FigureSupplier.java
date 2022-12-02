package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANGE_VALUES = 10;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private final Random random = new Random();
    private final ColorSupplier supplierColor = new ColorSupplier();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FigureType.values().length);
        switch (figureNumber) {
            case 0:
                return createCircle();
            case 1:
                return createIsoscelesTrapezoid();
            case 2:
                return createRectangle();
            case 3:
                return createRightTriangle();
            default:
                return createSquare();
        }
    }

    public Figure rectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(random.nextInt(RANGE_VALUES));
        rectangle.setWidth(random.nextInt(RANGE_VALUES));
        rectangle.setColor(supplierColor.getRandomColor().name());
        return rectangle;
    }

    public Figure trapezoid() {
        IsoscelesTrapezoid trapezoid = new IsoscelesTrapezoid();
        trapezoid.setHeight(random.nextInt(RANGE_VALUES));
        trapezoid.setMiddleLine(random.nextInt(RANGE_VALUES));
        trapezoid.setColor(supplierColor.getRandomColor().name());
        return trapezoid;
    }

    public Figure square() {
        Square square = new Square();
        square.setSide(random.nextInt(RANGE_VALUES));
        square.setColor(supplierColor.getRandomColor().name());
        return square;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_RADIUS);
        circle.setColor(DEFAULT_COLOR);
        return circle;
    }

    private Figure createCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(RANGE_VALUES));
        circle.setColor(supplierColor.getRandomColor().name());
        return circle;
    }

    private Figure createIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setMiddleLine(random.nextInt(RANGE_VALUES));
        isoscelesTrapezoid.setHeight(random.nextInt(RANGE_VALUES));
        isoscelesTrapezoid.setColor(supplierColor.getRandomColor().name());
        return isoscelesTrapezoid;
    }

    private Figure createRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(random.nextInt(RANGE_VALUES));
        rectangle.setHeight(random.nextInt(RANGE_VALUES));
        rectangle.setColor(supplierColor.getRandomColor().name());
        return rectangle;
    }

    private Figure createRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(RANGE_VALUES));
        rightTriangle.setSecondLeg(random.nextInt(RANGE_VALUES));
        rightTriangle.setColor(supplierColor.getRandomColor().name());
        return rightTriangle;
    }

    private Figure createSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(RANGE_VALUES));
        square.setColor(supplierColor.getRandomColor().name());
        return square;
    }

}
