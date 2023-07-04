package core.basesyntax.service;

import core.basesyntax.constants.ColorName;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public ColorName getRandomColor() {
        int index = random.nextInt(ColorName.values().length);
        return ColorName.values()[index];
    }
}
