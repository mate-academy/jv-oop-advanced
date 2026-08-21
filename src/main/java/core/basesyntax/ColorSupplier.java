package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final int COLOR_COUNT = Color.values().length;
    Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(COLOR_COUNT);
        return String.valueOf(Color.values()[index]);
    }
}
