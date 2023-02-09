package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = Color.values().length;
    private Random random = new Random();

    public ColorSupplier() {
        random = new Random();
    }

    public String getRandomColor() {
        int randomColorIndex = random.nextInt(NUMBER_OF_COLORS);
        return Color.values()[randomColorIndex].name();
    }
}
