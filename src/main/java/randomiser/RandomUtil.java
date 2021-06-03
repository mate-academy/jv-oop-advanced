package randomiser;

import java.util.Random;

public class RandomUtil {
    private Random random;

    public RandomUtil() {
        random = new Random();
    }

    public int getRandomIndex(int num) {
        return random.nextInt(num);
    }

    public double getDouble(int limit) {
        return random.nextDouble() + random.nextInt(limit);
    }
}
