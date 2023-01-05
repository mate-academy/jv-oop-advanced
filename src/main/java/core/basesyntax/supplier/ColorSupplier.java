package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    public static final Random random;

    static {
        random = new Random();
    }

    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
