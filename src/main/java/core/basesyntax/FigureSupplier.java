package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int NUM_FIGURE_TYPES = 5;
    private static final double SIDE_LIMIT = 10.0;
    private static final int DEFAULT_RADIUS = 10;
    private static final String DEFAULT_COLOR = "white";

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomType = random.nextInt(NUM_FIGURE_TYPES);
        String randomColor = new ColorSupplier().getRandomColor();
        switch (randomType) {
            case 0:
                return new Square(getRandomSide(), randomColor);
            case 1:
                return new Rectangle(getRandomSide(), getRandomSide(), randomColor);
            case 2:
                return new RightTriangle(getRandomSide(), getRandomSide(), randomColor);
            case 3:
                return new Circle(getRandomSide(), randomColor);
            default:
                return new IsoscelesTrapezoid(getRandomSide(), getRandomSide(),
                        getRandomSide(), randomColor);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    private double getRandomSide() {
        return random.nextDouble() * SIDE_LIMIT;
    }
}
