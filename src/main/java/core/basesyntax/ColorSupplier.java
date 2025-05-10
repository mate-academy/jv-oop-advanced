package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final String COLOR_WHITE = "white";
    private final Random random;
    private final String[] colors = {"white", "red", "orange", "yellow", "green", "blue",
            "purple", "brown", "black"};

    public ColorSupplier(final Random random) {
        this.random = random;
    }

    public String getRandomColor() {
        final int index = random.nextInt(colors.length);
        return colors[index];
    }
}
