package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"Red", "Blue", "Yellow", "Black", "White"};
    private static final Random RANDOM = new Random();

    public String getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}
