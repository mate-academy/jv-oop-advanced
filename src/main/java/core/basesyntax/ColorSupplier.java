package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        Color[] availableColors = Color.values();
        int randomNumberForColor = random.nextInt(availableColors.length);
        return availableColors[randomNumberForColor];
    }
}
