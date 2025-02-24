package core.basesyntax;

import java.util.Random;

public class UnitSupplier {
    private final Random random = new Random();
    public int getRandomNumber() {
        return random.nextInt(1, 11);
    }
}
