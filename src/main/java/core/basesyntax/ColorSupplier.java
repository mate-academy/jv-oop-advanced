package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final String[] COLORS = {"Red", "Blue", "Green", "Yellow",
            "Purple", "Black", "White"};
    private final Random random;

    public ColorSupplier() {
        this.random = new Random();
    }

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
