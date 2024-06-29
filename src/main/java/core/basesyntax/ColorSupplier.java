package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public Color getRandomColor() {
        int index = random.nextInt(Color.values().length);
        Color[] colorValues = Color.values();
        return colorValues[index];
    }
}
