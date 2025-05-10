package core.basesyntax;

import java.util.Random;

public class SideSupplier {
    private static final int BOUND = 10;
    private final Random random = new Random();

    public int getRandomSide() {
        return random.nextInt(BOUND) + 1;
    }
}
