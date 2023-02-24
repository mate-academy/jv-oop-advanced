package core.basesyntax;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplier {
    private static final Color[] colors = Color.values();
    private final Random random = ThreadLocalRandom.current();

    public Color getRandomColor() {
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex];
    }
}
