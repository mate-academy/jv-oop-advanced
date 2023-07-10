package core.basesyntax.tools;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor(Random randomHelper) {
        int colorRandomIndex = randomHelper.nextInt(Color.values().length);
        return Color.values()[colorRandomIndex];
    }
}
