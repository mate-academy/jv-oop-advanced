package core.basesyntax;

import java.util.Random;

public abstract class RandomSupplier {
    private final Random random = new Random();

    public int getRandomInt(int num) {
        return random.nextInt(num);
    }
}
