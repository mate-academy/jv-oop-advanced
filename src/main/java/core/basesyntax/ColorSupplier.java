package core.basesyntax;

import java.util.Locale;
import java.util.Random;

public class ColorSupplier {
    public String getRandomColor() {

        return String.valueOf(Color.values()[new Random().nextInt(Color.values().length)])
                .toLowerCase(Locale.ROOT);
    }
}
