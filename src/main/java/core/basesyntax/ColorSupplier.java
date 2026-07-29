package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final String[] COLORS = {
            "Red", "Green", "Blue", "Yellow", "Orange", "Purple", "White", "Black"
    };
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLORS.length);
        return COLORS[index];
    }
}
