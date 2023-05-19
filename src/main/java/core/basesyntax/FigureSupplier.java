package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUMBER_OF_FIGURES = 5;
    private final String DEFAULT_COLOR = "WHITE";
    private final int DEFAULT_RADIUS = 10;
    private final int MAX_BOUND = 50;
    private final Random random = new Random();
    private final ColorSupplier supplier = new ColorSupplier();
    String randomColor = supplier.getRandomColor();

    private int generateRandomValue() {
        return random.nextInt(MAX_BOUND) + 1;
    }

    public Figure getRandomFigure() {
        int figureType = random.nextInt(NUMBER_OF_FIGURES);

        switch (figureType) {
            case 0:
                return new Square(randomColor, generateRandomValue());
            case 1:
                return new Circle(randomColor, generateRandomValue());
            case 2:
                return new Rectangle(randomColor, generateRandomValue(), generateRandomValue());
            case 3:
                return new RightRectangle(randomColor, generateRandomValue(), generateRandomValue());
            case 4:
                return new IsoscelesTrapezoid(randomColor, generateRandomValue(), generateRandomValue(), generateRandomValue());
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
