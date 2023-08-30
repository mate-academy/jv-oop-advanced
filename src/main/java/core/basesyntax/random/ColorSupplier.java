package core.basesyntax.random;

import core.basesyntax.enams.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private String color;

    public String getRandomColor() {
        int value = random.nextInt(Color.values().length);
        color = String.valueOf(Color.values()[value]);
        return color;
    }

    public String getDefaultColor() {
        return Color.WHITE.name().toLowerCase();
    }
}
