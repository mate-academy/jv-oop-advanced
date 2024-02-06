package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        final int numberOfColors = Color.values().length;
        int colorIndex = random.nextInt(numberOfColors);
        return Color.values()[colorIndex].toString();
    }
}
