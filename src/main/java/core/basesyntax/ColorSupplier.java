package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MaxRandomNumber = 6;
    private final Random random = new Random();

    public String getRandomColor() {
        return random.nextInt(MaxRandomNumber) == 5 ? "purple" :
                (random.nextInt(MaxRandomNumber) == 4 ? "blue" :
                (random.nextInt(MaxRandomNumber) == 3 ? "green" :
                        (random.nextInt(MaxRandomNumber) == 2 ? "yellow" :
                        (random.nextInt(MaxRandomNumber) == 1 ? "red" : "orange"))));
    }
}
