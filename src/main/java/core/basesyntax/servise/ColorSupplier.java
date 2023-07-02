package core.basesyntax.servise;

import core.basesyntax.constants.ColorName;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(ColorName.values().length);
        return ColorName.values()[index].name();
    }
}
