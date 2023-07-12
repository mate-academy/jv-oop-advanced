package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getColor() {
        Color[] colors = Color.values();
        int value = random.nextInt(colors.length);
        return colors[value];
    }
}
