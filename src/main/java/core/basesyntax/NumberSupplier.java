package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    public static final int FIGURE_MAX_VALUE = 50;
    public static final int FIGURE_MIN_VALUE = 10;
    private Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(FIGURE_MAX_VALUE - FIGURE_MIN_VALUE) + FIGURE_MIN_VALUE;
    }
}
