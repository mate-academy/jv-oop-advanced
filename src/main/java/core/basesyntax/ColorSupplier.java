package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int NUMBER_OF_COLORS = Color.values().length;
    private static final Random random = new Random();

    public String getRandomColor() {
        int randomNumber = random.nextInt(NUMBER_OF_COLORS);
        return Color.values()[randomNumber].name().toLowerCase();
    }
}
