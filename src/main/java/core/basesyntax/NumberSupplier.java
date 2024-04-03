package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public double getRandomNumber() {
        return random.nextInt(MAX_NUMBER);
    }
}
