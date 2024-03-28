package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_RANDOM_INT = 100;
    private static final double MAX_RANDOM_DOUBLE = 100.0;
    private static final int DEFAULT_FIGURE_SIDE = 10;
    private static final int MAX_FIGURE_NUMBER = 5;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = random.nextInt(MAX_FIGURE_NUMBER);
        return switch (figure) {
            case 0 -> new Circle(colorSupplier.getRandomColor(), getRandomInt());
            case 1 -> new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble(),
                    getRandomDouble());
            case 2 -> new Rectangle(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble());
            case 3 -> new RightTriangle(colorSupplier.getRandomColor(),
                    getRandomDouble(),
                    getRandomDouble());
            case 4 -> new Square(colorSupplier.getRandomColor(),
                     getRandomDouble());
            default -> throw new IllegalArgumentException("Invalid figure number" + figure);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_FIGURE_SIDE);
    }

    private int getRandomInt() {
        return random.nextInt(MAX_RANDOM_INT);
    }

    private double getRandomDouble() {
        return random.nextDouble(MAX_RANDOM_DOUBLE);
    }
}
