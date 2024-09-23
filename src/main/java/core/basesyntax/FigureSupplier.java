package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_VALUE = 10;
    private static final int DEFAULT_RADIUS = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();

        switch (random.nextInt(FIGURE_COUNT)) {
            case 0:
                return new Square(color, getRandomValue());
            case 1:
                return new Rectangle(color, getRandomValue(), getRandomValue());
            case 2:
                return new RightTriangle(color, getRandomValue(), getRandomValue());
            case 3:
                return new Circle(color, getRandomValue());
            default:
                return new IsoscelesTrapezoid(color, getRandomValue(),
                        getRandomValue(), getRandomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), DEFAULT_RADIUS);
    }

    public double getRandomValue() {
        return random.nextDouble() * MAX_VALUE;
    }
}
