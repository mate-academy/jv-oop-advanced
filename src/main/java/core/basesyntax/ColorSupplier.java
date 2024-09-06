package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int MAX_VALUE = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        return String.valueOf(Color.values()[random.nextInt(MAX_VALUE)]);
    }
}
