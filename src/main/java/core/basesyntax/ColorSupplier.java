package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public Color getRandomColor() {
        Color[] colorValues = Color.values();
        int colorIndex = random.nextInt(colorValues.length);
        return Color.valueOf(Color.values()[colorIndex].name());
    }
}
