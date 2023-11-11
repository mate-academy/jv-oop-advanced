package core.basesyntax;

import core.basesyntax.model.enums.Color;
import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();
    public String getRandomColor() {
        Color[] values = Color.values();
        return values[random.nextInt(values.length)].name();
    }
}
