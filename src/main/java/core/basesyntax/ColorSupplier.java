package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {
        int color = new Random().nextInt(Color.values().length - 1);
        return Color.values()[color].name().toLowerCase(Locale.ROOT);
    }
}
