package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Colors getRandomColor() {
        int colorNumber = random.nextInt(5);
        return Colors.values()[colorNumber];
    }
}
