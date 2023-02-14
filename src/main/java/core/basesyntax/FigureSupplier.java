package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_SIZE = 100;
    private static final double DEFAULT_SIZE = 10;
    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        switch (randomFigure) {
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRightTriangle();
            case 3:
                return getRandomIsoscelesTrapezoid();
            case 4:
                return getRandomRectangle();
            default:
        }
        return getRandomSquare();
    }

    public Figure getRandomCircle() {
        Circle circle = new Circle(random.nextInt(MAX_RANDOM_SIZE),
                supplier.getRandomColor());
        circle.getArea();
        return circle;
    }

    public Figure getRandomRightTriangle() {
        RightTriangle rightTriangle = new RightTriangle(random
                .nextInt(MAX_RANDOM_SIZE),
                random.nextInt(MAX_RANDOM_SIZE), supplier.getRandomColor());
        rightTriangle.getArea();
        return rightTriangle;
    }

    public Figure getRandomIsoscelesTrapezoid() {
        IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid(random
                .nextInt(MAX_RANDOM_SIZE),
                random.nextInt(MAX_RANDOM_SIZE), random
                .nextInt(MAX_RANDOM_SIZE),
                supplier.getRandomColor());
        isoscelesTrapezoid.getArea();
        return isoscelesTrapezoid;
    }

    public Figure getRandomRectangle() {
        Rectangle rectangle = new Rectangle(random.nextInt(MAX_RANDOM_SIZE),
                random.nextInt(MAX_RANDOM_SIZE), supplier.getRandomColor());
        rectangle.getArea();
        return rectangle;
    }

    public Figure getRandomSquare() {
        Square square = new Square(random.nextInt(MAX_RANDOM_SIZE),
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
