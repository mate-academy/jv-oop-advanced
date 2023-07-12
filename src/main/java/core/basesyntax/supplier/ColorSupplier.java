package core.basesyntax.supplier;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int randomBound = Color.values().length;
        return Color.values()[random.nextInt(randomBound)].name();
    }
}
