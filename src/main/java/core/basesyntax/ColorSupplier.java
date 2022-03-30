package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int UPPER_BOUND = Color.values().length;

    public String getRandomColor() {
        int index = new Random().nextInt(UPPER_BOUND);
        return Color.values()[index].toString().toLowerCase();
    }
}
