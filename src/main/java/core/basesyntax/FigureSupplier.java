package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int MAX_VALUE = 50;
    private final Random random;

    public FigureSupplier(Random random) {
        this.random = random;
    }

    public int randomFigureSupplier(int random) {
        random = this.random.nextInt(MAX_VALUE);
        return random;
    }

    public int randomFigureSupplier(int random, int anotherRandom) {
        random = this.random.nextInt(MAX_VALUE);
        anotherRandom = this.random.nextInt(MAX_VALUE);
        return random + anotherRandom;
    }
}
