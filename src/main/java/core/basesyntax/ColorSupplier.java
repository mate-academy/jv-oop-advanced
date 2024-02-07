package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private static final int COLOR_COUNT = Color.values().length;
    private Random rand = new Random();

    public String getRandomColor() {
        int index = rand.nextInt(COLOR_COUNT);
        return Color.values()[index].name().toLowerCase(Locale.ROOT);
    }
}
