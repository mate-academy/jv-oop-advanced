package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int maxColorNumber = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(maxColorNumber);
        return String.valueOf(Color.values()[colorNumber]);
    }
}
