package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    Color[] colorSet = Color.values();

    public String getRandomColor() {
        int index = random.nextInt(colorSet.length);
        return colorSet[index].name();
    }
}
