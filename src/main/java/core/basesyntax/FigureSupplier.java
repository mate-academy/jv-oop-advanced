package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_SIZE = 100;
    private Random randomFigure = new Random();
    private Random randomParameter = new Random();
    private int dieNumber;
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        dieNumber = randomFigure.nextInt(5) + 1;
        switch (dieNumber) {
            case 1:
                Circle circle = new Circle(randomParameter.nextInt(MAX_RANDOM_SIZE),
                        supplier.getRandomColor());
                circle.getArea();
                return circle;
            case 2:
                RightTriangle rightTriangle = new RightTriangle(randomParameter
                        .nextInt(MAX_RANDOM_SIZE),
                        randomParameter.nextInt(MAX_RANDOM_SIZE), supplier.getRandomColor());
                rightTriangle.getArea();
                return rightTriangle;
            case 3:
                IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randomParameter
                        .nextInt(MAX_RANDOM_SIZE),
                        randomParameter.nextInt(MAX_RANDOM_SIZE), randomParameter
                        .nextInt(MAX_RANDOM_SIZE),
                        supplier.getRandomColor());
                isoscelesTrapezoid.getArea();
                return isoscelesTrapezoid;
            case 4:
                Rectangle rectangle = new Rectangle(randomParameter.nextInt(MAX_RANDOM_SIZE),
                        randomParameter.nextInt(MAX_RANDOM_SIZE), supplier.getRandomColor());
                rectangle.getArea();
                return rectangle;
            case 5:
                Square square = new Square(randomParameter.nextInt(MAX_RANDOM_SIZE),
                        supplier.getRandomColor());
                square.getArea();
                return square;
            default:
        }
        return null;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(10, Color.WHITE);
        circle.getArea();
        return circle;
    }
}
