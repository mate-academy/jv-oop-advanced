package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    private Figure createCircle() {
        Figure circle = new Circle(random.nextInt(MAX_SIZE) + 1);
        circle.setColor(supplier.getRandomColor());
        return circle;
    }

    private Figure createRightTriangle() {
        Figure rightTriangle = new RightTriangle(random.nextInt(MAX_SIZE) + 1,
                random.nextInt(MAX_SIZE) + 1);
        rightTriangle.setColor(supplier.getRandomColor());
        return rightTriangle;
    }

    private Figure createSquare() {
        Figure square = new Square(random.nextInt(MAX_SIZE) + 1);
        square.setColor(supplier.getRandomColor());
        return square;
    }

    private Figure createRectangle() {
        Figure rectangle = new Rectangle(random.nextInt(MAX_SIZE) + 1,
                random.nextInt(MAX_SIZE) + 1);
        rectangle.setColor(supplier.getRandomColor());
        return rectangle;
    }

    private Figure createIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(MAX_SIZE) + 1,
                random.nextInt(MAX_SIZE) + 1,
                random.nextInt(MAX_SIZE) + 1);
        isoscelesTrapezoid.setColor(supplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FigureType.values().length);
        switch (figureNumber) {
            case 0:
                return createCircle();
            case 1:
                return createRectangle();
            case 2:
                return createSquare();
            case 3:
                return createRightTriangle();
            default:
                return createIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        Figure circle = new Circle(10);
        circle.setColor(Color.WHITE.name());
        return circle;
    }
}
