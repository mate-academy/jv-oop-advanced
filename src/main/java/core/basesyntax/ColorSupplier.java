package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] colors = Color.values();

    public Color getRandomColor() {
        int index = random.nextInt(colors.length - 1);
        return colors[index];
    }
}
