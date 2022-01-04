package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
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
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
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
            default:
                getRandomIsoscelesTrapezoid();
                return isoscelesTrapezoid;
        }
    }

    private void getRandomCircle() {
        circle.setRadius(random.nextInt(20) + 1);
        circle.setColor(supplier.getRandomColor());
    }

    private void getRandomSquare() {
        square.setSide(random.nextInt(35) + 1);
        square.setColor(supplier.getRandomColor());
    }

    private void getRandomRectangle() {
        rectangle.setFirstSide(random.nextInt(25) + 1);
        rectangle.setSecondSide(random.nextInt(40) + 1);
        rectangle.setColor(supplier.getRandomColor());
    }

    private void getRandomRightTriangle() {
        rightTriangle.setFirstLeg(random.nextInt(30) + 1);
        rightTriangle.setSecondLeg(random.nextInt(50) + 1);
        rightTriangle.setColor(supplier.getRandomColor());
    }

    private void getRandomIsoscelesTrapezoid() {
        isoscelesTrapezoid.setFirstBase(random.nextInt(50) + 1);
        isoscelesTrapezoid.setSecondBase(random.nextInt(20) + 1);
        isoscelesTrapezoid.setHeight(random.nextInt(15) + 1);
        isoscelesTrapezoid.setColor(supplier.getRandomColor());
    }
}
