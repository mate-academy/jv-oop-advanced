package core.basesyntax.suppliers;

import core.basesyntax.Color;
import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)].name();
    }
}
