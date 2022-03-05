package supplier;

import core.basesyntax.Color;

import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int colorIndex = new Random().nextInt(Color.values().length - 1);
        return Color.values()[colorIndex].name();
    }
}
