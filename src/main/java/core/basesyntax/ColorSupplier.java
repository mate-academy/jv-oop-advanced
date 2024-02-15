package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private static final Color[] COLORS = Color.values();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index].name();
    }
}
