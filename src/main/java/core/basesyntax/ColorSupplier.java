package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int randomColorCode = random.nextInt(Color.values().length);
        Color color = Color.values()[randomColorCode];
        return color.name();
    }
}
