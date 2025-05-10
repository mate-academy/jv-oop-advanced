package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "green", "yellow", "orange", "purple"};

    public String getRandomColor() {
        Random rand = new Random();
        return COLORS[rand.nextInt(COLORS.length)];
    }
}
