package core.basesyntax;

import java.util.Random;

public class ArayLength {
    public static final int ARRAY_LENGTH = 10;
    private Random random = new Random();

    public int getLengthOfArray() {
        int arrayI = random.nextInt(ARRAY_LENGTH);
        return arrayI;
    }
}
