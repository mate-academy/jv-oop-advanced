package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = Color.WHITE.name().toLowerCase();
    private static final int FIGURES_NUMBER = 5;
    private static final int MAX_RANDOM_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (random.nextInt(FIGURES_NUMBER)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomSquare();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            case 4:
            default:
                return getRandomTrapezoid();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private Figure getRandomCircle() {
        return new Circle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomSquare() {
        return new Square(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRectangle() {
        return new Rectangle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }

    private Figure getRandomTrapezoid() {
        return new IsoscelesTrapezoid(
                colorSupplier.getRandomColor(),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER),
                random.nextInt(MAX_RANDOM_NUMBER));
    }
}
