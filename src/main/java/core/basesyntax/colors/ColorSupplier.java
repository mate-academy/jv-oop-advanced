package core.basesyntax.colors;

import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        return Colors.values()[random.nextInt(Colors.values().length)].name();
    }
}
