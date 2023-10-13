package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();
    private static final Color[] colors = Color.values();

    public static Color getRandomColor() {
        int index = random.nextInt(colors.length);
        return colors[index];
    }
}