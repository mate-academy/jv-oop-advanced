package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    private static final int COLOR_FIGURE = Color.values().length;

    public Color getRandomColor() {
        int index = new Random().nextInt(COLOR_FIGURE);
        return Color.values()[index];
    }
}
