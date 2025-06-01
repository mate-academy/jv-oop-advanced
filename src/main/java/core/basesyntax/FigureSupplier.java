package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_VALUE = 100;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Circle(color, getRandomDouble());
            case 1:
                return new Rectangle(color, getRandomDouble(), getRandomDouble());
            case 2:
                return new Square(color, getRandomDouble());
            case 3:
                return new RightTriangle(color, getRandomDouble(), getRandomDouble());
            default:
                return new IsoscelesTrapezoid(color, getRandomDouble(), getRandomDouble(),
                        getRandomDouble());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

    private double getRandomDouble() {
        return random.nextDouble() * MAX_VALUE;
    }
}
