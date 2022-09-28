package core.basesyntax.utils;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        // random integer in length of number of BallColor
        // values
        int randomInt = random.nextInt(Colors.values().length);
        return Colors.values()[randomInt].getLabel();
    }
}
