package core.basesyntax;
import java.util.Random;
public class RandomSize {
    private Random random = new Random();

    public static final int LOWER_BOUND = 1;
    public static final int UPPER_BOUND = 46340;

    public int getRandomSize() {
        int size = random.nextInt(UPPER_BOUND - LOWER_BOUND) + LOWER_BOUND;
        return size;
    }
}
