package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private final Color[] arrayOfColors = Color.values();

    public String getRandomColor() {
        int index = random.nextInt(arrayOfColors.length);
        return arrayOfColors[index].name();
    }
}
