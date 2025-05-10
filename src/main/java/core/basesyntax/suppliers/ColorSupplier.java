package core.basesyntax.suppliers;

import core.basesyntax.colors.Color;
import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int randomNumber = random.nextInt(colors.length);
        return colors[randomNumber];
    }
}
