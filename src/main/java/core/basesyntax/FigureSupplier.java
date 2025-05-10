package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int RANDOM_MAX_BOUND = 100;
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return createRandomCircle();
            case 1:
                return createRandomRectangle();
            case 2:
                return createRandomSquare();
            case 3:
                return createRandomRightTriangle();
            case 4:
                return createRandomIsoscelesTrapezoid();
            default:
                return getDefaultFigure();
        }
    }

    private Figure createRandomCircle() {
        return new Circle(random.nextInt(RANDOM_MAX_BOUND), colorSupplier.getRandomColor());
    }

    private Figure createRandomRectangle() {
        return new Rectangle(random.nextInt(RANDOM_MAX_BOUND), random.nextInt(RANDOM_MAX_BOUND),
                colorSupplier.getRandomColor());
    }

    private Figure createRandomSquare() {
        return new Square(random.nextInt(RANDOM_MAX_BOUND), colorSupplier.getRandomColor());
    }

    private Figure createRandomRightTriangle() {
        return new RightTriangle(random.nextInt(RANDOM_MAX_BOUND), random.nextInt(RANDOM_MAX_BOUND),
                random.nextInt(RANDOM_MAX_BOUND), colorSupplier.getRandomColor());
    }

    private Figure createRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(random.nextInt(100), random.nextInt(RANDOM_MAX_BOUND),
                random.nextInt(RANDOM_MAX_BOUND), colorSupplier.getRandomColor());
    }
}
