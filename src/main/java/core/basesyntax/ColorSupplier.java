package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        String currentColor = Color.values()[index].toString();
        return currentColor.toLowerCase(Locale.ROOT);
    }
}
