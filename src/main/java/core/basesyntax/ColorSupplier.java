package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS
        = new String[]{"blue", "yellow", "green", "grey", "pink", "orange"};

    public String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
