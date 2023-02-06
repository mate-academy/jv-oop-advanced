package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_NUMBER = new Random().nextInt(Color.values().length);

    public Color getRandomColor() {
        return Color.values()[COLOR_NUMBER];
    }
}
