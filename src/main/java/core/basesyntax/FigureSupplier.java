package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_SIZE = 10;
    private static final int CASE_RANDOM_MAX_SIZE = 4;
    private static final int CASE_DEFAULT_MAX_SIZE = 3;
    private static final int CIRCLE_SIZE = 10;
    private static final int SQUARE_SIZE = 5;
    private static final int RECTANGLE_LENGTH = 7;
    private static final int RECTANGLE_WIDTH = 3;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int caseRandom = random.nextInt(CASE_RANDOM_MAX_SIZE);
        switch (caseRandom) {
            case 1: return getRandomSquare();
            case 2: return getRandomRectangle();
            case 3: return getRandomRightTriangle();
            default: return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        int caseDefault = random.nextInt(CASE_DEFAULT_MAX_SIZE);
        switch (caseDefault) {
            case 1: return getDefaultCircle();
            case 2: return getDefaultSquare();
            default: return getDefaultRectangle();
        }
    }

    private Figure getDefaultCircle() {
        return new Circle(Color.WHITE.name(), CIRCLE_SIZE);
    }

    private Figure getDefaultSquare() {
        return new Square(Color.BLACK.name(), SQUARE_SIZE);
    }

    private Figure getDefaultRectangle() {
        return new Rectangle(Color.SILVER.name(), RECTANGLE_LENGTH, RECTANGLE_WIDTH);
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE));
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE),
                random.nextInt(MAX_SIZE), random.nextInt(MAX_SIZE));
    }
}
