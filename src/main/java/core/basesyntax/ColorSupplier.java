package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private static final Color[] COLORS = Color.values();

    public String getRandomColor() {
        int colorInt = random.nextInt(COLORS.length);
        return COLORS[colorInt].name();
    }
}
