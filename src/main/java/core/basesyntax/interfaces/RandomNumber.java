package core.basesyntax.interfaces;

import java.util.Random;

public interface RandomNumber {
    default int getRandomNumber(Random random, int maxValue) {
        return random.nextInt(maxValue);
    }
}
