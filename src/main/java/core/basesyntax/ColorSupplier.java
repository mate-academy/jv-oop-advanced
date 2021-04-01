package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[]{"red", "green", "blue", "yellow",
            "black", "pink"};

    public String getRandomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
