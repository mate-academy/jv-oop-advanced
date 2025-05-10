package core.basesyntax;

import java.util.Random;

public class NumberSupplier {
    private final Random random;

    public NumberSupplier(Random random) {
        this.random = random;
    }

    public double generateRandomNumber() {
        return random.nextDouble() + 1.0;
    }

    public double generateFirstRandomNumberForTrapezoid() {
        return random.nextDouble() + 1.0;
    }

    public double generateSecondRandomNumberForTrapezoid() {
        double firstBase = generateFirstRandomNumberForTrapezoid();
        return firstBase * 2;
    }
}
