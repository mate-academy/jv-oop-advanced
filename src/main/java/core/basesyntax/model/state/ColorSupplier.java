package core.basesyntax.model.state;

import java.util.Random;

public class ColorSupplier {
    private static Random random = new Random();
    private static final String[] COLORS = new String[]{
            "blue", "yellow", "red", "white",
            "black", "green", "orange", "purple",
            "brown", "pink", "gray", "golden"
    };

    public static String generateColor() {
        return COLORS[random.nextInt(COLORS.length)];
    }
}
