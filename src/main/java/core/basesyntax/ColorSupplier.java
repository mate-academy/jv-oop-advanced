package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        Color[] colorValues = Color.values();
        int index = random.nextInt(colorValues.length);
        return colorValues[index].name();
    }
}
