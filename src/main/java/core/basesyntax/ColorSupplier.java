package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random random = new Random();

    public String getRandomColor() {
        return Icolors.values()[random.nextInt(Icolors.values().length)].toString();
    }
}
