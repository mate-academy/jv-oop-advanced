package core.basesyntax;

import java.util.Random;

public class RandomSize {
    private Random random = new Random();

    private int lowerBound = 1;
    private int upperBound = 46340;

    public int getSize() {
        int size = random.nextInt(upperBound - lowerBound) + lowerBound;
        return size;
    }
}
