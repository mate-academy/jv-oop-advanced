package core.basesyntax;

import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();

    public static int getRandomInt(int max) {
        return RANDOM.nextInt(max);
    }

}
