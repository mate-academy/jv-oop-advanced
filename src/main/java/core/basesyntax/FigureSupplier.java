package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int BOUND = 5;
    private static final int MAX_VALUE = 100;
    private static final String DEFAULT_COLOR = "white";
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int index = random.nextInt(BOUND);
        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getIsoscelesTrapezoid();
            case 2:
                return getSquare();
            case 3:
                return getRightTriangle();
            default:
                return getRectangle();
        }
    }

    private Figure getCircle() {
        return new Circle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1,
                random.nextInt(MAX_VALUE) + 1, random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1,
                random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1,
                random.nextInt(MAX_VALUE) + 1);
    }

    private Figure getSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_VALUE) + 1);
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
