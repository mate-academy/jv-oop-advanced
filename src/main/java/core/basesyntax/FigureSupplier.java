package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int FIGURE_COUNT = 5;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private int range = 6;

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(range) + range);
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(range) + range);
    }

    private RightTriangle getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(range)
                + range, random.nextInt(range) + range);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(range)
                + range, random.nextInt(range) + range);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(range)
                + range, random.nextInt(range) + range,
                random.nextInt(range) + range);
    }

    public Figure getRandomFigure() {
        int choice = random.nextInt(FIGURE_COUNT);
        switch (choice) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomTriangle();
            case 3:
                return getRandomRectangle();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
