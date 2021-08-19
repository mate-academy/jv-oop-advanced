package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[]
            COLORS;

    static {
        COLORS = new String[]{"yellow", "red", "green", "blue", "black"};
    }

    private Random random = new Random();

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
