package core.basesyntax;

import java.util.Random;

public class RandomNumberFigures {
    public int randomInt(int number) {
        return new Random().nextInt(number);
    }
}
