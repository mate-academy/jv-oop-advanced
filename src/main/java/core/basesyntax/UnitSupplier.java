package core.basesyntax;

import java.util.Random;

public class UnitSupplier {
    int MIN_VALUE = 1;
    int MAX_VALUE = 11;
    private final Random random = new Random();

    public int getRandomNumber() {
        return random.nextInt(MIN_VALUE, MAX_VALUE);
    }
}
