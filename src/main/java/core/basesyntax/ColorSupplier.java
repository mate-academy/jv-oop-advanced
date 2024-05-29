package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final String[] COLORS = {"Red", "Green", "Blue", "Yellow", "Purple"};

    public String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
