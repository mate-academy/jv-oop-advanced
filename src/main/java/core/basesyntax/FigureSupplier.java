package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int RANGE_OF_RANDOM_NUMBERS = 100;
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURES_COUNT = 4;
    private final Random random;
    private final ColorSupplier color;

    public FigureSupplier() {
        this.random = new Random();
        this.color = new ColorSupplier();
    }

    public int getRandomSize() {
        return (random.nextInt(RANGE_OF_RANDOM_NUMBERS));
    }

    public Figure getRandomFigure() {
        int value = random.nextInt(FIGURES_COUNT);
        switch (value) {
            case 0:
                return new Circle(getRandomSize(), color.getRandomColor());
            case 1:
                return new Rectangle(getRandomSize(), getRandomSize(), color.getRandomColor());
            case 2:
                return new RightTriangle(getRandomSize(), color.getRandomColor());
            case 3:
                return new Square(getRandomSize(), color.getRandomColor());
            default:
                return new IsoscelesTrapezoid(getRandomSize(), getRandomSize(),
                        getRandomSize(), color.getRandomColor());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_RADIUS, Color.WHITE);
    }
}
