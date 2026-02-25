package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final Random RANDOM = new Random();
    public static final ColorSupplier COLOR_SUPPLIER = new ColorSupplier();
    public static final int MAX_LEN = 50;
    public static final int ORIGIN = 1;
    public static final int BOUND = 6;
    public static final int DEFAULT_CIRCLE_RADIUS = 10;

    public Figure getRandomFigure() {
        int rndNum = RANDOM.nextInt(ORIGIN, BOUND);
        return switch (rndNum) {
            case 1 -> new Circle(Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0, COLOR_SUPPLIER.getRandomColor());
            case 2 -> new IsoscelesTrapezoid(Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0,
                    Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0,
                    Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0, COLOR_SUPPLIER.getRandomColor());
            case 3 -> new Rectangle(Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0,
                    Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0,
                    COLOR_SUPPLIER.getRandomColor());
            case 4 -> new RightTriangle(Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0,
                    Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0,
                    Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0, COLOR_SUPPLIER.getRandomColor());
            case 5 -> new Square(Math.round(RANDOM.nextDouble(MAX_LEN) * 100.0) / 100.0, COLOR_SUPPLIER.getRandomColor());
            default -> getDefaultFigure();
        };
    }
    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_RADIUS, Color.WHITE.name());
    }
}
