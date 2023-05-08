package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 30;
    private static final int DEFAULT_SIZE = 10;
    private static final String DEFAULT_COLOR = "WHITE";
    private static final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {

        switch (random.nextInt(FIGURES_COUNT)) {
            case 0:
                return createRandomSquare();
            case 1:
                return createRandomCircle();
            case 2:
                return createRandomIsoscelesTrapezoid();
            case 3:
                return createRandomRectangle();
            default:
                return createRandomRightTriangle();
        }
    }

    private Square createRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
    }

    private Circle createRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
    }

    private RightTriangle createRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER,
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
    }

    private IsoscelesTrapezoid createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER,
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER,
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
    }

    private Rectangle createRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER,
        random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER);
    }

    public Figure createDefaultFigure() {
        return new Circle(DEFAULT_COLOR,DEFAULT_SIZE);
    }
}
