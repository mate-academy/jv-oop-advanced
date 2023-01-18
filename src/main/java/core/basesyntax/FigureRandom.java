package core.basesyntax;
import java.util.Random;

public class FigureRandom {
    private final Random random = new Random();
    private final int BOUND = 100;
    public int getRandomNum() {
        return random.nextInt(BOUND);
    }
}

