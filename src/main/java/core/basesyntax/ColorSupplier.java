package core.basesyntax;

import java.util.concurrent.ThreadLocalRandom;

public class ColorSupplier {
    private static final String[] COLORS = {"red", "blue", "green", "yellow", "black"};

    public String getRandomColor() {
        int index = ThreadLocalRandom.current().nextInt(COLORS.length);
        return COLORS[index];
    }
}

