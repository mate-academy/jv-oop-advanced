package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final int MAX_SMALL_SIDE_VALUE = 15;
    private static final int MAX_BIG_SIDE_VALUE = 25;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return getRandomRightTriangle();
            case 1:
                return getRandomCircle();
            case 2:
                return gerRandomSquare();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
            default:
                return getRandomRectangle();
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(DEFAULT_CIRCLE_RADIUS);
        circle.setColor(Color.WHITE.name());
        return circle;
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(MAX_SMALL_SIDE_VALUE));
        rightTriangle.setSecondLeg(random.nextInt(MAX_SMALL_SIDE_VALUE));
        rightTriangle.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return rightTriangle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(MAX_SMALL_SIDE_VALUE));
        circle.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return circle;
    }

    private Figure gerRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(MAX_SMALL_SIDE_VALUE));
        square.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return square;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(MAX_SMALL_SIDE_VALUE));
        isoscelesTrapezoid.setLowerBase(random.nextInt(MAX_BIG_SIDE_VALUE));
        isoscelesTrapezoid.setUpperBase(random.nextInt(MAX_SMALL_SIDE_VALUE));
        isoscelesTrapezoid.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return isoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(random.nextInt(MAX_SMALL_SIDE_VALUE));
        rectangle.setHeight(random.nextInt(MAX_SMALL_SIDE_VALUE));
        rectangle.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return rectangle;
    }
}
