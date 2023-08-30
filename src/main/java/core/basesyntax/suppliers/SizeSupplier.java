package core.basesyntax.suppliers;

import java.util.Random;

public class SizeSupplier {
    private static final int MAX_VALUE = 30;
    private static final int MIN_VALUE = 1;
    private Random random = new Random();

    public int getRandomArrayIndex(int size) {
        return random.nextInt(size);
    }

    public int getRandomSideSize() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    public int getRandomRadiusSize() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    public int getDefaultRadiusSize() {
        return 10;
    }

    public int getRandomBaseSize() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    public int getRandomHeightSize() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }

    public int getRandomLegSize() {
        return random.nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
