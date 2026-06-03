package core.basesyntax.suppliers;

import color.Color;
import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        Color color = COLORS[random.nextInt(COLORS.length)];
        return color.toString();
    }
}
