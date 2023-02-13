package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_SIZE = 100;
    private static final double DEFAULT_SIZE = 100;
    private Random randomFigure = new Random();
    private Random randomParameter = new Random();
    private int dieNumber;
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        dieNumber = randomFigure.nextInt(5) + 1;
        switch (dieNumber) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRectangle();
            case 5:
                return getRandomSquare();
            default:
        }
        return null;
    }

    public Figure getRandomCircle() {
        Circle circle = new Circle(randomParameter.nextInt(MAX_RANDOM_SIZE),
                supplier.getRandomColor());
        circle.getArea();
        return circle;
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(randomParameter
                .nextInt(MAX_RANDOM_SIZE),
                randomParameter.nextInt(MAX_RANDOM_SIZE), supplier.getRandomColor());
        rightTriangle.getArea();
        return rightTriangle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(randomParameter
                .nextInt(MAX_RANDOM_SIZE),
                randomParameter.nextInt(MAX_RANDOM_SIZE), randomParameter
                .nextInt(MAX_RANDOM_SIZE),
                supplier.getRandomColor());
        isoscelesTrapezoid.getArea();
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle(randomParameter.nextInt(MAX_RANDOM_SIZE),
                randomParameter.nextInt(MAX_RANDOM_SIZE), supplier.getRandomColor());
        rectangle.getArea();
        return rectangle;
    }

    public Figure getRandomSquare() {
        Square square = new Square(randomParameter.nextInt(MAX_RANDOM_SIZE),
                supplier.getRandomColor());
        square.getArea();
        return square;
    }

    public Figure getDefaultFigure() {
        Circle circle = new Circle(DEFAULT_SIZE, Color.WHITE);
        circle.getArea();
        return circle;
    }
}
