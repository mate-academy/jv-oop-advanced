package core.basesyntax;

import java.util.Random;

public class UnitSupplier {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 11;
    private final Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(MIN_VALUE, MAX_VALUE);
    }

    public Random getRandom() {
        return random;
    }
}
