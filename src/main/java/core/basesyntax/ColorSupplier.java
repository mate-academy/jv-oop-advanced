package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = 11;

    public String getRandomColor() {
        int index = new Random().nextInt(COLOR_COUNT);
        return Color.values()[index].toString();
    }
}
