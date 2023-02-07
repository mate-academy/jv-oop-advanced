package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int colorNumber = new Random().nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[colorNumber];
    }
}
