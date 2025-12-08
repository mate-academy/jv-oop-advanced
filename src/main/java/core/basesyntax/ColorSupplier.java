package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    public String getRandomColor(String ThreadLocalRandom) {
        Color[] colors = Color.values();
        int index = new Random().nextInt(colors.length);
        return ThreadLocalRandom;
    }
}
