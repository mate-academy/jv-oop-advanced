package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private Figure getRandomCircle() {
        Figure circle = new Circle(random.nextInt(FIGURE_COUNT));
        circle.setColor(colorSupplier.getRandomColor());
        return circle;
    }

    private Figure getRandomSquare() {
        Figure square = new Square(random.nextInt(FIGURE_COUNT));
        square.setColor(colorSupplier.getRandomColor());
        return square;
    }

    private Figure getRandomRectangle() {
        Figure rectangle = new Rectangle(random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT));
        rectangle.setColor(colorSupplier.getRandomColor());
        return rectangle;
    }

    private Figure getRandomRightTriangle() {
        Figure rightTriangle = new RightTriangle(random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT));
        rightTriangle.setColor(colorSupplier.getRandomColor());
        return rightTriangle;
    }

    private Figure getRandomIsoscelesTrapezoid() {
        Figure isoscelesTrapezoid = new IsoscelesTrapezoid(random.nextInt(FIGURE_COUNT),
                random.nextInt(FIGURE_COUNT));
        isoscelesTrapezoid.setColor(colorSupplier.getRandomColor());
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
        Figure figure = new Circle(RADIUS);
        figure.setColor(Color.WHITE);
        return figure;
    }
}
