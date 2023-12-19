package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private Double createRandomDouble() {
        return random.nextDouble();
    }

    private String createRandomColor() {
        return colorSupplier.getRandomColor();
    }

    public Figure getRandomFigure() {
        int randomFigureNumber = random.nextInt(NUMBER_OF_FIGURES);
        return switch (randomFigureNumber) {
            case 0 -> new Square(createRandomDouble(), createRandomColor());
            case 1 -> new Rectangle(createRandomDouble(), createRandomDouble(),
                    createRandomColor());
            case 2 -> new RightTriangle(createRandomDouble(), createRandomDouble(),
                    createRandomColor());
            case 3 -> new Circle(createRandomDouble(), createRandomColor());
            default -> new IsoscelesTrapezoid(createRandomDouble(), createRandomDouble(),
                    createRandomDouble(), createRandomColor());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE.name());
    }
}
