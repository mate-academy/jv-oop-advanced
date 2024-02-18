package core.basesyntax.helpers;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private final Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public String getRandomColor() {
        int randomIndex = random.nextInt(COLORS.length);
        return COLORS[randomIndex].name();
    }
}
