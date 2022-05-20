package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    public static final int DEFAULT_RADIUS = 10;
    public static final String DEFAULT_COLOR = "white";
    public static final int RANGE_LIMIT = 1000;
    private final Random random;
    private final ColorSupplier colorSupplier;

    public FigureSupplier(Random random, ColorSupplier colorSupplier) {
        this.random = random;
        this.colorSupplier = colorSupplier;
    }

    public Figure getRandomFigure() {
        int index = random.nextInt(4);
        String color = colorSupplier.getRandomColor();
        int valueA = random.nextInt(RANGE_LIMIT) + 1;
        int valueB = random.nextInt(RANGE_LIMIT) + 1;
        int valueC = random.nextInt(RANGE_LIMIT) + 1;
        switch (index) {
            case 0:
                return new Square("Square", color, valueA);
            case 1:
                return new Rectangle("Rectangle", color, valueA, valueB);
            case 2:
                return new RightTriangle("RightTriangle", color, valueA, valueB);
            case 3:
                return new Circle("Circle", color, valueA);
            default:
                return new IsoscelesTrapezoid("IsoscelesTrapezoid", color, valueA, valueB, valueC);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("Circle", DEFAULT_COLOR, DEFAULT_RADIUS);
    }
}
