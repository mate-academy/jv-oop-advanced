package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURES_COUNT = 5;
    private static final int DEFAULT_RADIUS = 10;
    private static final int MAX_RANDOM_VALUE = 25;

    public Figure getRandomFigure() {
        Random randomFigure = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        Random randomValue = new Random();
        switch (randomFigure.nextInt(FIGURES_COUNT)) {
            case (0):
                return new Circle(colorSupplier.getRandomColor(),
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1);
            case (1):
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1,
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1,
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1);
            case (2):
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1,
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1);
            case (3):
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1,
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1);
            case (4):
                return new Square(colorSupplier.getRandomColor(),
                        randomValue.nextInt(MAX_RANDOM_VALUE) + 1);
            default:
                return getRandomFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.toString().toLowerCase(), DEFAULT_RADIUS);
    }
}
