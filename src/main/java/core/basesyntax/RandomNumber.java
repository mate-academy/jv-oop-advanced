package core.basesyntax;

import java.util.Random;

public class RandomNumber {

    public static int getRandomNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound) + 1;
    }

}
