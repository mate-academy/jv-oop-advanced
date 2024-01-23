package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "purple"};
    private final Random random = new Random();

    public String getRandomColor() {
        int colorIndex = random.nextInt(COLORS.length);
        return COLORS[colorIndex];
    }
}
