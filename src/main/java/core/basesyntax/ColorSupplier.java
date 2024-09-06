package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int MAX_COLOR_NUMBER = Color.values().length;
    private final Random random = new Random();

    public String getRandomColor() {
        int colorNumber = random.nextInt(MAX_COLOR_NUMBER);
        return String.valueOf(Color.values()[colorNumber]);
    }
}
