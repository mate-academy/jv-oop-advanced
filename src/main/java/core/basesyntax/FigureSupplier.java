package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_AMOUNT = 5;

    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        Circle circle = new Circle();
        circle.setName("Circle");
        circle.setRadius(random.nextInt(100));
        circle.setColor(supplier.getRandomColor());

        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        isoscelesTrapezoid.setName("IsoscelesTrapezoid");
        isoscelesTrapezoid.setColor(supplier.getRandomColor());
        isoscelesTrapezoid.setHeight(random.nextInt(100));
        isoscelesTrapezoid.setSideOne(random.nextInt(100));
        isoscelesTrapezoid.setSideTwo(random.nextInt(100));
        isoscelesTrapezoid.setColor(supplier.getRandomColor());

        Rectangle rectangle = new Rectangle();
        rectangle.setName("Rectangle");
        rectangle.setSideOne(random.nextInt(100));
        rectangle.setSideTwo(random.nextInt(100));
        rectangle.setColor(supplier.getRandomColor());

        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle.setName("RightTriangle");
        rightTriangle.setFirstLeg(random.nextInt(100));
        rightTriangle.setSecondLeg(random.nextInt(100));
        rightTriangle.setColor(supplier.getRandomColor());

        Square square = new Square();
        square.setName("Square");
        square.setSide(random.nextInt(100));
        square.setColor(supplier.getRandomColor());

        int currentRandomFigureIndex = random.nextInt(FIGURE_AMOUNT);
        Figure[] randomFigure = {circle, isoscelesTrapezoid, rectangle, rightTriangle, square};
        return randomFigure[currentRandomFigureIndex];
    }

    public Circle getDefaultFigure() {
        Circle whiteCircle = new Circle();
        whiteCircle.setName("Circle");
        whiteCircle.setColor("White");
        whiteCircle.setRadius(10);
        return whiteCircle;
    }
}
