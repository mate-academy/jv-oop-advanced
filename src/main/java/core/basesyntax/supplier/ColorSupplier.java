package core.basesyntax.supplier;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        int randomIndex = random.nextInt(Color.values().length);
        return Color.values()[randomIndex];
    }
}
