package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    private final Circle circle = new Circle();
    private final Circle circleConstant = new Circle();
    private final Square square = new Square();
    private final Rectangle rectangle = new Rectangle();
    private final RightTriangle rightTriangle = new RightTriangle();
    private final IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();

    public Figure getDefaultFigure() {
        circleConstant.setRadius(10);
        circleConstant.setColor("WHITE");
        return circleConstant;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(5)) {
            case 0:
                getRandomCircle();
                return circle;
            case 1:
                getRandomSquare();
                return square;
            case 2:
                getRandomRectangle();
                return rectangle;
            case 3:
                getRandomRightTriangle();
                return rightTriangle;
            case 4:
                getRandomIsoscelesTrapezoid();
                return isoscelesTrapezoid;
            default:
                return null;
        }
    }

    private void getRandomCircle() {
        circle.setRadius(random.nextInt(20));
        circle.setColor(supplier.getRandomColor());
    }

    private void getRandomSquare() {
        square.setSide(random.nextInt(35));
        square.setColor(supplier.getRandomColor());
    }

    private void getRandomRectangle() {
        rectangle.setFirstSide(random.nextInt(25));
        rectangle.setSecondSide(random.nextInt(40));
        rectangle.setColor(supplier.getRandomColor());
    }

    private void getRandomRightTriangle() {
        rightTriangle.setFirstLeg(random.nextInt(30));
        rightTriangle.setSecondLeg(random.nextInt(50));
        rightTriangle.setColor(supplier.getRandomColor());
    }

    private void getRandomIsoscelesTrapezoid() {
        isoscelesTrapezoid.setFirstBase(random.nextInt(50));
        isoscelesTrapezoid.setSecondBase(random.nextInt(20));
        isoscelesTrapezoid.setHeight(random.nextInt(15));
        isoscelesTrapezoid.setColor(supplier.getRandomColor());
    }
}
