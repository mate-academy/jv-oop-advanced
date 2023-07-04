package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOTTOM_RANDOM_VALUE = 1;
    private static final int TOP_RANDOM_VALUE = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomValue());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomValue());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomValue() {
        return BOTTOM_RANDOM_VALUE + random.nextInt(TOP_RANDOM_VALUE);
    }
}

