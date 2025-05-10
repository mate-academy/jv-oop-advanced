package core.basesyntax.models.painter;

import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(Color.values().length);
        return Color.values()[randomColorIndex].name();
    }
}
