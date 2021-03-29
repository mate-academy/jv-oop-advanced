package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = new String[] {"red", "orange",
            "yellow", "green", "blue", "violet", "pink", "black"};

    public static String randomColor() {
        return COLORS[new Random().nextInt(COLORS.length)];
    }
}
