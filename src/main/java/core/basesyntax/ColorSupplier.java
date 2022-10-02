package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {"Black","White","Yellow","Green","Orange","Blue"};
    private Random random;

    ColorSupplier(Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
