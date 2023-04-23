package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    private static final String[] COLORS = {"red", "blue", "green", "black", "white", "yellow"};

    public String getRandomColor() {
        int value = RANDOM.nextInt(COLORS.length);
        return COLORS[value];
    }
}
