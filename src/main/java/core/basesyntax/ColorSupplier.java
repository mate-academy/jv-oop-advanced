package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private Random rand = new Random();
    private static final int COLOR_COUNT = Colors.values().length;

    public String getRandomColor() {
        int index = rand.nextInt(COLOR_COUNT);
        return Colors.values()[index].name().toLowerCase(Locale.ROOT);
    }
}
