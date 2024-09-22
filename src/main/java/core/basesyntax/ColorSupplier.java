package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();
    private static final String[] COLORS = {
            "Red", "Green", "Blue", "Yellow", "Orange", "Purple", "Pink", "Black", "White", "Gray"
    };

    public String getRandomColor() {
        return COLORS[RANDOM.nextInt(COLORS.length)];
    }
}
