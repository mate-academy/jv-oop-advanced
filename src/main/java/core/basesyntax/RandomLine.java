package core.basesyntax;

import java.util.Random;

public class RandomLine {
    public int getRandomSide() {
        int randomSide = new Random().nextInt(10);
        return randomSide;
    }
}
