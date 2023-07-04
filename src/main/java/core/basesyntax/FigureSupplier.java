package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final Color DEFAULT_COLOR = Color.WHITE;
    private static final int DEFAULT_RADIUS = 10;
    private static final int BOTTOM_RANDOM_VALUES = 1;
    private static final int TOP_RANDOM_VALUE = 110;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    public Figure getRandomFigure() {
        int figureNumber = random.nextInt(FIGURE_COUNT);
        switch (figureNumber) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(),
                        getRandomValues());
            case 1:
                return new Rectangle(colorSupplier.getRandomColor(),
                        getRandomValues(), getRandomValues());
            case 2:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        getRandomValues(), getRandomValues(), getRandomValues());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        getRandomValues(), getRandomValues());
            default:
                return new Square(colorSupplier.getRandomColor(),
                        getRandomValues());
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_COLOR, DEFAULT_RADIUS);
    }

    private int getRandomValues() {
        return BOTTOM_RANDOM_VALUES + random.nextInt(TOP_RANDOM_VALUE);
    }
}

