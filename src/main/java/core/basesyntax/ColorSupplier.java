package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    private static final Color[] COLORS = Color.values();

    public String getRandomColor() {
        int index = RANDOM.nextInt(COLORS.length);
        return COLORS[index].name();
    }
}
