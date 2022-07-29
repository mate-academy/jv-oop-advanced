package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;
    int randomNumber = new Random().nextInt(COLOR_COUNT);

    public Color getRandomColor() {
        return Color.values()[randomNumber];
    }
}
