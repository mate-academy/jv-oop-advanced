package core.basesyntax;

import java.util.Random;

public abstract class Figure implements HasArea, Drawable {
    //limit of figure size when generating randomly
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 100;
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public static int getRandomDimension() {
        Random random = new Random();
        return random.nextInt(MIN_DIMENSION, MAX_DIMENSION);
    }
}
