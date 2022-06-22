package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[colorIndex]);
    }
}
