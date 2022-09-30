package core.basesyntax.suppliers;

import java.util.Random;

public class ColorSupplier {
    public static final String DEFAULT_COLOR = "white";
    public static final String[] COLORS = {
            DEFAULT_COLOR,
            "black",
            "red",
            "orange",
            "grey",
            "brown",
            "lime",
            "violet"
    };
    private final Random randomSupplier = new Random();

    public String getRandomColor() {
        return COLORS[randomSupplier.nextInt(COLORS.length)];
    }
}
