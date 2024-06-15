package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public static final Random random = new Random();
    public static final Color[] values = Color.values();

    public String getRandomColor() {
        int index = random.nextInt(values.length);
        return Color.values()[index].name().toLowerCase();
    }
}
