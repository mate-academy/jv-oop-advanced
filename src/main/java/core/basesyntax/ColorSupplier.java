package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Color[] COLORS = Color.values();
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
