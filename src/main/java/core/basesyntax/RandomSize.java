package core.basesyntax;

import java.util.Random;

public class RandomSize {
    public static final int LOWER_BOUND = 1;
    public static final int UPPER_BOUND = 46340;

    private Random random = new Random();

    public int getRandomSize() {
        int size = random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND;
        return size;
    }
}
