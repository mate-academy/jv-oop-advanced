package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private final Random random = new Random();

    public String getRandomColor() {
        final int colorAmount = Color.values().length;
        int index = random.nextInt(colorAmount);
        Color color = Color.values()[index];
        return color.name();
    }
}
