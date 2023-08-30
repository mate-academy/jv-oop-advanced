package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final int MAX_NUMBER = 6;
    private final Random random = new Random();

    public String getRandomColor() {
        return Color.values()[random.nextInt(MAX_NUMBER)].name();
    }
}
