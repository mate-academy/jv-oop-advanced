package core.basesyntax;

import java.util.Random;

public class RandomNumberFigures {
    public int getRandomInt(int number) {
        return new Random().nextInt(number);
    }
}
