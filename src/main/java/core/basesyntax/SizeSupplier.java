package core.basesyntax;

import java.util.Random;

public class SizeSupplier {
    public static final int MAX_SIZE = 100;
    private final Random random = new Random();

    public int getRandomSize() {
        return random.nextInt(MAX_SIZE) + 1;
    }
}
