package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomFigure = random.nextInt(FIGURE_COUNT);
        switch (randomFigure) {
            case 0:
                return getRandomSquare();
            case 1:
                return getRandomCircle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                System.out.println("this figure does not exist");
        }
        return null;
    }

    private Figure getRandomCircle() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(
                String.valueOf(supplier.getRandomColor()), random.nextInt(100),
                random.nextInt(100), random.nextInt(100));
        return isoscelesTrapezoid;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Figure circle = new Circle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(100));
        return circle;
    }

    private Figure getRandomRightTriangle() {
        Figure rightTriangle = new RightTriangle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(100), random.nextInt(100));
        return rightTriangle;
    }

    private Figure getRandomRectangle() {
        Figure rectangle = new Rectangle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(100), random.nextInt(100));
        return rectangle;
    }

    private Figure getRandomSquare() {
        Figure square = new Square(String.valueOf(supplier.getRandomColor()),
                random.nextInt(100));
        return square;
    }

    public Figure getDefaultFigure() {
        return new Circle(String.valueOf(Color.WHITE),10);
    }
}
