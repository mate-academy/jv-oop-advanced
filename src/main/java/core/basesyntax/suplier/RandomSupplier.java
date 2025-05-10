package core.basesyntax.suplier;

import java.util.Random;

public abstract class RandomSupplier {
    public static final int MIN_VALUE = 1;
    public static final int MAX_VALUE = 20;
    private Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public int getRandomValue() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
