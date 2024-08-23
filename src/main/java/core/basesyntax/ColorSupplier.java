package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private static final String[] COLORS
            = {"red", "green", "blue", "yellow", "pink", "black", "white"};

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
