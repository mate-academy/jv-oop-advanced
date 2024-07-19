package core.basesyntax;

import core.basesyntax.model.ColorRandomizer;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(ColorRandomizer.values().length);
        return ColorRandomizer.values()[colorIndex].toString();
    }
}
