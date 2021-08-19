package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RANDOM_VALUE = 20;
    private static final Random RANDOM = new Random();

    public Figure getRandomFigure() {
        int randomNumber = RANDOM.nextInt(FIGURE_COUNT);
        switch (randomNumber) {
            case 0: return createCircle();
            case 1: return createIsoscelesTrapezoid();
            case 2: return createRectangle();
            case 3: return createRightTriangle();
            default: return createSquare();
        }
    }

    private Figure createCircle() {
        return new Circle(RANDOM.nextInt(RANDOM_VALUE));
    }

    private Figure createIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(
                RANDOM.nextInt(RANDOM_VALUE),
                RANDOM.nextInt(RANDOM_VALUE),
                RANDOM.nextInt(RANDOM_VALUE));
    }

    private Figure createRectangle() {
        return new Rectangle(
                RANDOM.nextInt(RANDOM_VALUE),
                RANDOM.nextInt(RANDOM_VALUE));
    }

    private Figure createRightTriangle() {
        return new RightTriangle(RANDOM.nextInt(RANDOM_VALUE));
    }

    private Figure createSquare() {
        return new Square(RANDOM.nextInt(RANDOM_VALUE));
    }
}
