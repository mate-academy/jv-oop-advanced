package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int DEFAULT_CIRCLE_RADIUS = 10;
    private static final String DEFAULT_CIRCLE_COLOR = Color.WHITE.name();
    private static final int MIN_SIDE_LENGTH = 5;
    private static final int MAX_SIDE_LENGTH = 15;
    private final Random random = new Random();

    public Figure getDefaultFigure() {
        return new Circle(DEFAULT_CIRCLE_COLOR, DEFAULT_CIRCLE_RADIUS);
    }

    public int getRandomSideLength() {
        return random.nextInt(MAX_SIDE_LENGTH) + MIN_SIDE_LENGTH;
    }
}
