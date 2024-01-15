package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    private Random random = new Random();

    public String getRandomColor() {
        int index = random.nextInt(Colors.values().length);
        return String.valueOf(Colors.values()[index]).toLowerCase(Locale.ROOT);
    }
}
