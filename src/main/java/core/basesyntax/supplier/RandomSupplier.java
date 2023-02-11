package core.basesyntax.supplier;

import java.util.Random;

public class RandomSupplier {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 25;
    private Random random = new Random();

    public int getRandomValue() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
