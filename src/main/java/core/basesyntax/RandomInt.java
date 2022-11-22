package core.basesyntax;

import java.util.Random;

public class RandomInt {
    public static int getRandomInt(int a) {
        Random random = new Random();
        int number = random.nextInt(a);
        return number;
    }
}
