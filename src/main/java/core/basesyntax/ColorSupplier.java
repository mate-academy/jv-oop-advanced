package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int COLOR_AMOUNT = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLOR_AMOUNT);
        Color color = Color.values()[index];
        return color.name();
    }
}
