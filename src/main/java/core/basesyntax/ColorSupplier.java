package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();
    private int index = getRandom().nextInt(Colors.values().length);

    public int getIndex() {
        return index;
    }

    public String getRandomColor() {
        return "" + Colors.values()[getIndex()];
    }

    public Random getRandom() {
        return random;
    }
}
