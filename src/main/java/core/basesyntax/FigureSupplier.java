package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random RANDOM = new Random();
    private static final String DEFAULT_COLOR = Color.WHITE.name();
    private static final int DEFAULT_RADIUS = 10;
    private static final int FIGURE_TYPES_COUNT = 5;
    private static final int RANDOM_NUMBER_SIZE = 10;

    public Figure getRandomFigure() {
        int figurType = RANDOM.nextInt(FIGURE_TYPES_COUNT);
        String color = new ColorSupplier().getRandomColor();
        switch (figurType) {
            case 0:
                return new Circle(color, getRandomSize());
            case 1:
                return new Square(color, getRandomSize());
            case 2:
                return new Rectangle(color, getRandomSize(), getRandomSize());
            case 3:
                return new RightTriangle(color, getRandomSize(),
                        getRandomSize(), getRandomSize());
            case 4:
            default:
                return new IsoscelesTrapezoid(color, getRandomSize(),
                        getRandomSize(), getRandomSize());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomSize() {
        return RANDOM.nextInt(RANDOM_NUMBER_SIZE) + 1;
    }
}
