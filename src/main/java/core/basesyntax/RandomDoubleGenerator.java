package core.basesyntax;

import java.util.Random;

public class RandomDoubleGenerator {
    private static final double MAX_FOR_RANDOM_DOUBLE = 100.0;
    private static final double MIN_FOR_RANDOM_DOUBLE = 0.0;
    private Random random = new Random();

    public Double getRandomDouble() {
        return (random.nextDouble() * (MAX_FOR_RANDOM_DOUBLE - MIN_FOR_RANDOM_DOUBLE))
                + MIN_FOR_RANDOM_DOUBLE;
    }
}
