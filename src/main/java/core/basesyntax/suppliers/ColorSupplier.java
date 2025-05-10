package core.basesyntax.suppliers;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return Color.valueOf(Color.values()[index].name());
    }
}
