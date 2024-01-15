package core.basesyntax;

import core.basesyntax.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        int randomColorNumber = random.nextInt(Color.values().length);
        return Color.values()[randomColorNumber].name();
    }
}
