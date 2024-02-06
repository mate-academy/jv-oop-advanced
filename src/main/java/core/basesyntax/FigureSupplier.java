package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANGE = 6;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

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

    private Circle getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(RANGE) + RANGE);
    }

    private Square getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(RANGE) + RANGE);
    }

    private RightTriangle getRandomTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(RANGE)
                + RANGE, random.nextInt(RANGE) + RANGE);
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(RANGE)
                + RANGE, random.nextInt(RANGE) + RANGE);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(RANGE)
                + RANGE, random.nextInt(RANGE) + RANGE,
                random.nextInt(RANGE) + RANGE);
    }
}
