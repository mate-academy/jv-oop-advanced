package core.basesyntax;

import java.util.Random;

public class RandomLongProducer {
    public static int get() {
        return new Random().nextInt(20);
    }
}
