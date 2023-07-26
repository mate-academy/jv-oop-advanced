package core.basesyntax.supplier;

import core.basesyntax.color.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int length = Color.values().length - 1;
        return new String(Color.values()[random.nextInt(length)].name());
    }
}
