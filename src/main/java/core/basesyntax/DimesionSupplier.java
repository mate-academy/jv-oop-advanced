package core.basesyntax;

import java.util.Random;

public class DimesionSupplier {
    private static final int RANDOM_PROPERTIES = 100;

    public int getRandomDimesion() {
        return new Random().nextInt(RANDOM_PROPERTIES) + 1;
    }
}
