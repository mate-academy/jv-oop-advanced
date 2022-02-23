package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_UNIQUE_FIGURES = 5;
    private static final int MAX_RANDOM_VALUE = 1000;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        int randomIndex = random.nextInt(NUMBER_OF_UNIQUE_FIGURES);

        switch (randomIndex) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomIsoscelesTrapezoid();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomRightTriangle();
            default:
                return getRandomSquare();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, DEFAULT_CIRCLE_RADIUS);
    }

    private double getRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(), getRandomValue());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(), getRandomValue(),
                getRandomValue(), getRandomValue());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(), getRandomValue(), getRandomValue());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(), getRandomValue(),
                getRandomValue());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(), getRandomValue());
    }
}
