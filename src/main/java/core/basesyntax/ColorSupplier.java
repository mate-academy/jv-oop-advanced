package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[] {"red", "blue", "yellow", "green", "white"};
    private Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
