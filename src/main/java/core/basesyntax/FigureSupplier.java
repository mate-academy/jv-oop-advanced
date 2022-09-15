package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int DEFAULT_RADIUS = 5;
    private static final String DEFAULT_COLOR = String.valueOf(Color.WHITE);
    private static final int COUNT_OF_RANDOM = 100;
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

    private Figure getRandomIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(
                String.valueOf(supplier.getRandomColor()), random.nextInt(COUNT_OF_RANDOM),
                random.nextInt(COUNT_OF_RANDOM), random.nextInt(COUNT_OF_RANDOM));
        return isoscelesTrapezoid;
    }

    private Figure getRandomCircle() {
        Figure circle = new Circle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(100));
        return circle;
    }

    private Figure getRandomRightTriangle() {
        Figure rightTriangle = new RightTriangle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(COUNT_OF_RANDOM), random.nextInt(COUNT_OF_RANDOM));
        return rightTriangle;
    }

    private Figure getRandomRectangle() {
        Figure rectangle = new Rectangle(String.valueOf(supplier.getRandomColor()),
                random.nextInt(COUNT_OF_RANDOM), random.nextInt(COUNT_OF_RANDOM));
        return rectangle;
    }

    private Figure getRandomSquare() {
        Figure square = new Square(String.valueOf(supplier.getRandomColor()),
                random.nextInt(COUNT_OF_RANDOM));
        return square;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_RADIUS);
    }
}
