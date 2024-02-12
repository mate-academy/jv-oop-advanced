package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] availableColors = Color.values();
        int randomNumberForColor = random.nextInt(availableColors.length);
        return availableColors[randomNumberForColor];
    }
}
