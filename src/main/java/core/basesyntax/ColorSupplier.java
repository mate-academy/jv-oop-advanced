package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;

    public Color getRandomColor() {
        final int randomNumber = new Random().nextInt(COLOR_COUNT);
        return Color.values()[randomNumber];
    }
}
