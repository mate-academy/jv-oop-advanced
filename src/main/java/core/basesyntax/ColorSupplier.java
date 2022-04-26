package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final int numberOfColors = Color.values().length;

    public String getRandomColor() {
        int colorIndex = random.nextInt(numberOfColors);
        return Color.values()[colorIndex].toString();
    }
}
