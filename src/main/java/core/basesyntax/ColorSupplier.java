package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "green", "yellow", "purple"};

    public String getRandomColors() {
        Random random = new Random();
        return COLORS[random.nextInt(COLORS.length)];
    }
}
