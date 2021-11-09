package core.basesyntax;

import java.util.Random;

public class BaseLine {
    public int getRandomSide() {
        int randomSide = new Random().nextInt(10);
        return randomSide;
    }
}
