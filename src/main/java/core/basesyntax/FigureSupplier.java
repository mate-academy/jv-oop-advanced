package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    private static final int MAX_LEN = 50;
    private static final int ORIGIN = 1;
    private static final int BOUND = 6;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    public Figure getRandomFigure() {
        int rndNum = RANDOM.nextInt(ORIGIN, BOUND);

        double len1 = generateLength();
        double len2 = generateLength();
        double len3 = generateLength();

        String color = COLOR_SUPPLIER.getRandomColor();

        return switch (rndNum) {
            case 1 -> new Circle(len1, color);
            case 2 -> new IsoscelesTrapezoid(len1, len2, len3, color);
            case 3 -> new Rectangle(len1, len2, color);
            case 4 -> new RightTriangle(len1, len2, len3, color);
            case 5 -> new Square(len1, color);
            default -> getDefaultFigure();
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name());
    }

    private double generateLength() {
        return Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0;
    }
}
