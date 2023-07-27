package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private static final int MAX_RANDOM_NUMBER = 1000;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Figure getRandomFigure() {
        switch (random.nextInt(NUMBER_OF_FIGURES)) {
            case 0:
                return getRandomCircle();
            case 1:
                return getRandomRightTriangle();
            case 2:
                return getRandomRectangle();
            case 3:
                return getRandomSquare();
            default:
                return getRandomIsoscelesTrapezoid();
        }
    }

    public double getRandomDouble() {
        return random.nextInt(MAX_RANDOM_NUMBER);
    }

    private Figure getRandomCircle() {
        return new Circle(colorSupplier.getRandomColor(),
                getRandomDouble());
    }

    private Figure getRandomRightTriangle() {
        return new RightTriangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Figure getRandomRectangle() {
        return new Rectangle(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Figure getRandomIsoscelesTrapezoid() {
        return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                getRandomDouble(),
                getRandomDouble(),
                getRandomDouble());
    }

    private Figure getRandomSquare() {
        return new Square(colorSupplier.getRandomColor(),
                getRandomDouble());
    }
}
