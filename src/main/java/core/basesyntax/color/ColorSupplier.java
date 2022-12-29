package core.basesyntax.color;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random(System.currentTimeMillis());

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name().toLowerCase();
    }
}
