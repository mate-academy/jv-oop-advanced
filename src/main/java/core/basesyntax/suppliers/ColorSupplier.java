package core.basesyntax.suppliers;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random RANDOM = new Random();

    public String getRandomColor() {
        int colorIndex = RANDOM.nextInt(Color.values().length);
        return Color.values()[colorIndex].name();
    }
}
