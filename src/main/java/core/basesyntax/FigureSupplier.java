package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final String defaultColor = "WHITE";
    private final int defaultRadius = 10;
    private final int maxBound = 50;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();

    private int generateRandomValue() {
        return random.nextInt(maxBound) + 1;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return new Square(supplier.getRandomColor(), generateRandomValue());
            case 1:
                return new Circle(supplier.getRandomColor(), generateRandomValue());
            case 2:
                return new Rectangle(supplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue());
            case 3:
                return new RightTriangle(supplier.getRandomColor(),
                        generateRandomValue(), generateRandomValue());
            case 4:
                return new IsoscelesTrapezoid(supplier.getRandomColor(), generateRandomValue(),
                        generateRandomValue(), generateRandomValue());
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(defaultColor, defaultRadius);
    }
}
