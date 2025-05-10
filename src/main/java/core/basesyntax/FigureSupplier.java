package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_RADIUS = 10;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int NUMBER_OF_FIGURES = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String randomColor = colorSupplier.getRandomColor();
        int randomFigureIndex = random.nextInt(NUMBER_OF_FIGURES);

        return switch (randomFigureIndex) {
            case 0 -> new Circle(calculateLength(), randomColor);
            case 1 -> new Rectangle(calculateLength(), calculateLength(), randomColor);
            case 2 -> new RightTriangle(calculateLength(), calculateLength(), randomColor);
            case 3 -> new Square(calculateLength(), randomColor);
            case 4 -> new IsoscelesTrapezoid(calculateLength(), calculateLength(),
                    calculateLength(), randomColor);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR.name());
    }

    private double calculateLength() {
        return random.nextDouble() * DEFAULT_RADIUS;
    }
}
