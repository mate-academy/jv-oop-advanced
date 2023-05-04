package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE = 5;
    private static final int MAX_VALUE = 10;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(FIGURE);

        switch (index) {
            case 0:
                Figure circle = new Circle(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
                circle.getArea();
                circle.draw();
                return circle;
            case 1:
                Figure rectangle = new Rectangle(supplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                rectangle.getArea();
                rectangle.draw();
                return rectangle;
            case 2:
                Figure isoscelesTrapezoid = new IsoscelesTrapezoid(supplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                isoscelesTrapezoid.getArea();
                isoscelesTrapezoid.draw();
                return isoscelesTrapezoid;
            case 3:
                Figure square = new Square(supplier.getRandomColor(), random.nextInt(MAX_VALUE));
                square.getArea();
                square.draw();
                return square;
            default:
                Figure rightTriangle = new RightTriangle(supplier.getRandomColor(),
                        random.nextInt(MAX_VALUE),
                        random.nextInt(MAX_VALUE));
                rightTriangle.getArea();
                rightTriangle.draw();
                return rightTriangle;
        }
    }

    public Figure getDefaultFigure() {

        Figure circle = new Circle(Color.WHITE, MAX_VALUE);
        circle.getArea();
        circle.draw();
        return circle;
    }
}
