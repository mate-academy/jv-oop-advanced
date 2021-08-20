package core.basesyntax;

import java.util.Random;

public class Randomizer {
    public int getRandomInt(int number) {
        return new Random().nextInt(number);
    }
}
