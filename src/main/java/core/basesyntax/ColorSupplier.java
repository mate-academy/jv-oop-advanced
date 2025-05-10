package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();

    public Color getRandomColor() {
        return colors[new Random().nextInt(colors.length)];
    }
}
