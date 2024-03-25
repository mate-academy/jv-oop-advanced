package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorValues = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(colorValues);
        Color color = Color.values()[index];
        return String.valueOf(color);
    }
}
