package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int RADIUS = 10;
    private static final int MAX_DIMENSION = 1000;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        switch (getRandomInteger(FIGURE_COUNT)) {
            case 0:
                return new Square(colorSupplier.getRandomColor(), getRandomInteger(MAX_DIMENSION));
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomInteger(MAX_DIMENSION), getRandomInteger(MAX_DIMENSION));
            case 2:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomInteger(MAX_DIMENSION), getRandomInteger(MAX_DIMENSION));
            case 3:
                return new Circle(colorSupplier.getRandomColor(), getRandomDouble());
            case 4:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomInteger(MAX_DIMENSION), getRandomInteger(MAX_DIMENSION),
                        getRandomInteger(MAX_DIMENSION));
            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), RADIUS);
    }

    private int getRandomInteger(int value) {
        return 1 + random.nextInt(value);
    }

    private double getRandomDouble() {
        return 1 + random.nextDouble() * FigureSupplier.MAX_DIMENSION;
    }
}
