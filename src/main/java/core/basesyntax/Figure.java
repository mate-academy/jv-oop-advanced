package core.basesyntax;

import java.util.Random;

public abstract class Figure implements HasArea, Drawable {
    //limit of figure size when generating randomly
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 100;
    private static final Random random = new Random();
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public static int getRandomDimension() {
        return random.nextInt(MIN_DIMENSION, MAX_DIMENSION);
    }
}
