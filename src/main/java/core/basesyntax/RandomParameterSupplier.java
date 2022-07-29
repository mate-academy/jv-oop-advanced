package core.basesyntax;

import java.util.Random;

public class RandomParameterSupplier {
    private static int MIN_VALUE = 2;
    private static int MAX_VALUE = 10;

    public int getRandomNumber() {
        return new Random().nextInt(MAX_VALUE) + MIN_VALUE;
    }
}
