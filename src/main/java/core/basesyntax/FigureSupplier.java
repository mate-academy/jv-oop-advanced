package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int SIZE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomCircle() {
        Figure circle = new Circle(colorSupplier.getRandomColor(),
                random.nextInt(SIZE));
        return circle;
    }

    private Figure getRandomSquare() {
        Figure square = new Square(colorSupplier.getRandomColor(),
                random.nextInt(SIZE));
        return square;
    }

    private Figure getRandomRectangle() {
        Figure rectangle = new Rectangle(colorSupplier.getRandomColor(),
                random.nextInt(SIZE),
                random.nextInt(SIZE));
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        Figure rightTriangle = new RightTriangle(colorSupplier.getRandomColor(),
                random.nextInt(SIZE),
                random.nextInt(SIZE));

        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(SIZE),
                random.nextInt(SIZE),colorSupplier.getRandomColor());
        return isoscelesTrapezoid;
    }

    public Figure getRandomFigure() {
        int number = random.nextInt(FIGURE_COUNT);
        switch (number) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
                return getRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        Figure figure = new Circle(Color.WHITE, SIZE);
        return figure;
    }
}
