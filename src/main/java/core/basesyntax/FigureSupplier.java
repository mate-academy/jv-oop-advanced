package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_LENGTH = 10;
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor().name();

        int randomFigureIndex = random.nextInt(NUMBER_OF_FIGURES);

        return switch (randomFigureIndex) {
            case 0 -> new Circle(calculateLength(), randomColor);
            case 1 -> new Rectangle(calculateLength(), calculateLength(), randomColor);
            case 2 -> new RightTriangle(calculateLength(), calculateLength(), randomColor);
            case 3 -> new Square(calculateLength(), randomColor);
            case 4 -> new IsoscelesTrapezoid(calculateLength(), calculateLength(),
                    calculateLength(), randomColor);
            default -> null;
        };
    }

    private double calculateLength() {
        return random.nextDouble() * DEFAULT_LENGTH;
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_LENGTH, Color.WHITE.name());
    }
}
