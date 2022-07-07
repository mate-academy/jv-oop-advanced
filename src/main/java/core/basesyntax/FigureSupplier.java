package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int SHAPES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(SHAPES)) {
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getRandomCircle();
            case 3:
                return gerRandomSquare();
            case 4:
                return getRandomIsoscelesTrapezoid();
            case 5:
                return getRandomRectangle();
            default:
                return null;
        }
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setFirstLeg(random.nextInt(10));
        rightTriangle.setSecondLeg(random.nextInt(10));
        rightTriangle.setColor(String.valueOf(Color.valueOf(colorSupplier.getRandomColor().toString())));
        return rightTriangle;
    }

    public Figure getRandomCircle() {
        Circle circle = new Circle();
        circle.setRadius(random.nextInt(10));
        circle.setColor(String.valueOf(Color.valueOf(colorSupplier.getRandomColor().toString())));
        return circle;
    }

    public Figure gerRandomSquare() {
        Square square = new Square();
        square.setSide(random.nextInt(10));
        square.setColor(String.valueOf(Color.valueOf(colorSupplier.getRandomColor().toString())));
        return square;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setHeight(random.nextInt(10));
        isoscelesTrapezoid.setLowerBase(random.nextInt(20));
        isoscelesTrapezoid.setUpperBase(random.nextInt(10));
        isoscelesTrapezoid.setColor(String.valueOf(Color.valueOf(colorSupplier.getRandomColor().toString())));
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(random.nextInt(10));
        rectangle.setHeight(random.nextInt(10));
        rectangle.setColor(String.valueOf(Color.valueOf(colorSupplier.getRandomColor().toString())));
        return rectangle;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setColor("WHITE");
        return circle;
    }
}
