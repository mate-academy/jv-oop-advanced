package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] arrayColors = Color.values();

    public Color getRandomColor() {
        int index = random.nextInt(arrayColors.length - 1);
        return arrayColors[index];
    }
}
