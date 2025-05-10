package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] colors = Color.values();
    private final Random random = new Random();

    public String getRandomColor() {
        return colors[random.nextInt(colors.length)].toString();
    }
}
