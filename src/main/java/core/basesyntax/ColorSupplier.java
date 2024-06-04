package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final String[] COLORS = {"red", "green", "blue", "yellow", "purple", "black", "white"};

    public String getRandomColor() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
