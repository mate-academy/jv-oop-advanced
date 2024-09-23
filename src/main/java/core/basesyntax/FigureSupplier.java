package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER = 5;
    private static final double DEFAULT_RADIUS = 10.0;

    public Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(NUMBER);
        ColorSupplier supplier = new ColorSupplier();
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid();
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        RightTriangle rightTriangle = new RightTriangle();
        Square square = new Square();
        Figure[] figures = {isoscelesTrapezoid, rectangle, circle, rightTriangle, square};

        switch (index) {
            case 0:
                isoscelesTrapezoid.setHeight(random.nextDouble());
                isoscelesTrapezoid.setSide(random.nextDouble());
                isoscelesTrapezoid.setSideB(random.nextDouble());
                isoscelesTrapezoid.setColor(supplier.getRandomColor());
                return figures[index];
            case 1:
                rectangle.setLength(random.nextDouble());
                rectangle.setWidth(random.nextDouble());
                rectangle.setColor(supplier.getRandomColor());
                return figures[index];
            case 2:
                circle.setRadius(random.nextDouble());
                circle.setColor(supplier.getRandomColor());
                return figures[index];
            case 3:
                rightTriangle.setSide(random.nextDouble());
                rightTriangle.setHeight(random.nextDouble());
                rightTriangle.setColor(supplier.getRandomColor());
                return figures[index];
            default:
                square.setSide(random.nextDouble());
                square.setColor(supplier.getRandomColor());
                return figures[index];
        }
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle();
        circle.setColor(Colors.WHITE);
        circle.setRadius(DEFAULT_RADIUS);
        return circle;
    }
}
