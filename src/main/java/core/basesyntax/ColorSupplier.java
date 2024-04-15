package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Colors getRandomColor() {
        final Random random = new Random();
        int index = random.nextInt(Colors.values().length);
        Colors color = Colors.values()[index];
        return color;
    }
}
