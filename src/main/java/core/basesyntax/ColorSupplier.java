package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getColorRandom() {
        Color[] color = Color.values();
        int randomIndex = random.nextInt(color.length);
        return color[randomIndex].name();
    }
}
