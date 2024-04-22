package core.basesyntax;

import java.util.Random;

public class DimensionSupplier {
    //limit of figure size when generating randomly
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 100;
    private static final Random random = new Random();

    public static int getRandomDimension() {
        return random.nextInt(MIN_DIMENSION, MAX_DIMENSION);
    }
}
