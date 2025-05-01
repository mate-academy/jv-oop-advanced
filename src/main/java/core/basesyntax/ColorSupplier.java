package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "yellow", "green", "blue", "black"};
    private final Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}