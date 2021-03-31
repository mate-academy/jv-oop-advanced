package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();
    private static final String[] COLORS = new String[] {
            "red", "blue", "white", "brown", "green", "pink", "yellow", "orange"
    };

    public static String colorFigures() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
