package core.basesyntax.suppliers;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public String getRandomColor() {
        int indexOfColor = random.nextInt(Color.values().length);
        return Color.values()[indexOfColor].name();
    }
}


