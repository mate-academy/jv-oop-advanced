package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_NUMBER = 5;
    private static final int CIRCLE_RADIUS = 10;
    private static final int SIDE_SMALL = 10;
    private static final int SIDE_BIG = 20;
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
                return getRandomRectangle();
            default:
                return getRandomRectangle();
        }
    }

    private Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(SIDE_SMALL));
        rightTriangle.setSecondLeg(random.nextInt(SIDE_SMALL));
        rightTriangle.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return rightTriangle;
    }

    private Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(SIDE_SMALL));
        circle.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return circle;
    }

    private Figure gerRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(SIDE_SMALL));
        square.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return square;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(SIDE_SMALL));
        isoscelesTrapezoid.setLowerBase(random.nextInt(SIDE_BIG));
        isoscelesTrapezoid.setUpperBase(random.nextInt(SIDE_SMALL));
        isoscelesTrapezoid.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return isoscelesTrapezoid;
    }

    private Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(random.nextInt(SIDE_SMALL));
        rectangle.setHeight(random.nextInt(SIDE_SMALL));
        rectangle.setColor(Color.valueOf(colorSupplier.getRandomColor().name()));
        return rectangle;
    }

    protected Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(CIRCLE_RADIUS);
        circle.setColor(String.valueOf(Color.WHITE));
        return circle;
    }
}
