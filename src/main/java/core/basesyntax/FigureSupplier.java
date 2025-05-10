package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        Circle circleConstant = new Circle();
        circleConstant.setRadius(10);
        circleConstant.setColor("WHITE");
        return circleConstant;
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                Circle circle = new Circle();
                circle.setRadius(random.nextInt(20) + 1);
                circle.setColor(supplier.getRandomColor());
                return circle;
            case 1:
                Square square = new Square();
                square.setSide(random.nextInt(35) + 1);
                square.setColor(supplier.getRandomColor());
                return square;
            case 2:
                Rectangle rectangle = new Rectangle();
                rectangle.setFirstSide(random.nextInt(25) + 1);
                rectangle.setSecondSide(random.nextInt(40) + 1);
                rectangle.setColor(supplier.getRandomColor());
                return rectangle;
            case 3:
                RightTriangle rightTriangle = new RightTriangle();
                rightTriangle.setFirstLeg(random.nextInt(30) + 1);
                rightTriangle.setSecondLeg(random.nextInt(50) + 1);
                rightTriangle.setColor(supplier.getRandomColor());
                return rightTriangle;
            default:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
                isoscelesTrapezoid.setFirstBase(random.nextInt(50) + 1);
                isoscelesTrapezoid.setSecondBase(random.nextInt(20) + 1);
                isoscelesTrapezoid.setHeight(random.nextInt(15) + 1);
                isoscelesTrapezoid.setColor(supplier.getRandomColor());
                return isoscelesTrapezoid;
        }
    }
}
