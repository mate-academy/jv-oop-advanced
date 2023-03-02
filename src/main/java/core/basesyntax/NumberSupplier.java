package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final int MAX_RANDOM_VALUE = 20;
    private final Random random = new Random();

    public int getMaxRandomValue() {
        return random.nextInt(MAX_RANDOM_VALUE);
    }
}
