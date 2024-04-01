package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_RANDOM_VALUE = 10;
    private static final double MIN_RANDOM_VALUE = 1;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        final int figureType = random.nextInt(FIGURE_COUNT);
        String color = colorSupplier.getRandomColor();
        switch (figureType) {
            case 0:
                return new Square(color, getRandomValue());
            case 1:
                return new Rectangle(color, getRandomValue(), getRandomValue());
            case 2:
                return new RightTriangle(color, getRandomValue(), getRandomValue());
            case 3:
                return new Circle(color, getRandomValue());
            case 4:
                return new IsoscelesTrapezoid(color, getRandomValue(),
                        getRandomValue(), getRandomValue());
            default:
                throw new IllegalStateException("Unexpected value: " + figureType);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), MAX_RANDOM_VALUE);
    }

    private double getRandomValue() {
        return random.nextDouble() * (MAX_RANDOM_VALUE - MIN_RANDOM_VALUE) + MIN_RANDOM_VALUE;
    }
}
