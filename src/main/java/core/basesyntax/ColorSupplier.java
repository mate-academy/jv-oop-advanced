package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "white"};
    private Random random;

    public String getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
