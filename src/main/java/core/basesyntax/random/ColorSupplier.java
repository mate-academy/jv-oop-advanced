package core.basesyntax.random;

import core.basesyntax.enams.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int value = random.nextInt(Color.values().length);
        return Color.values()[value].name();
    }

    public String getDefaultColor() {
        return Color.WHITE.name().toLowerCase();
    }
}
