package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();

    public String getRandomColor() {
        int length = Color.values().length;
        return Color.values()[random.nextInt(length)].name();
    }
}
