package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 4;
    private static final int BOUND_RANDOM = 100;
    private static final int CIRCLE_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private Random randomNumber = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int indexFigure = randomNumber.nextInt(FIGURES_COUNT);
        if (indexFigure == 0) {
            return getRandomSquare();
        } else if (indexFigure == 1) {
            return getRandomRectangle();
        } else if (indexFigure == 2) {
            return getRandomRightTriangle();
        } else {
            return getRandomIsoscelesTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(CIRCLE_RADIUS, DEFAULT_COLOR);
    }

    private IsoscelesTrapezoid getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(randomNumber.nextInt(BOUND_RANDOM),
                randomNumber.nextInt(BOUND_RANDOM),
                randomNumber.nextInt(BOUND_RANDOM),
                colorSupplier.getRandomColor());
    }

    private RightTriangle getRandomRightTriangle() {
        return new RightTriangle(randomNumber.nextInt(BOUND_RANDOM),
                randomNumber.nextInt(BOUND_RANDOM),
                colorSupplier.getRandomColor());
    }

    private Rectangle getRandomRectangle() {
        return new Rectangle(randomNumber.nextInt(BOUND_RANDOM),
                randomNumber.nextInt(BOUND_RANDOM),
                colorSupplier.getRandomColor());
    }

    private Square getRandomSquare() {
        return new Square(randomNumber.nextInt(BOUND_RANDOM), colorSupplier.getRandomColor());
    }
}
